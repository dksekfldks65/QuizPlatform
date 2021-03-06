importScripts("/resources/precache-manifest.ec58314a5d76f122e9c875b3c6475b95.js", "https://storage.googleapis.com/workbox-cdn/releases/4.3.1/workbox-sw.js");

workbox.precaching.precacheAndRoute(self.__precacheManifest);

const fullPath = self.location.pathname;
const lastIdx = fullPath.lastIndexOf('/') + 1;
const path = fullPath.substr(0, lastIdx);
const pageUrl = path + '/index.html';

workbox.routing.registerRoute(
  /^https:\/\/.+\.(jpe?g|png|gif|svg)$/i,
  new workbox.strategies.CacheFirst({
    cacheName: 'image-cache',
    plugins: [
      new workbox.expiration.Plugin({
        maxAgeSeconds: 7 * 24 * 60 * 60,  // Only cache requests for a week
        maxEntries: 40  // Only cache 40 requests.
      }),
      new workbox.cacheableResponse.Plugin({ statuses: [0, 200] }) // for CORS Image Cache
    ]
  })
);

workbox.routing.registerRoute(new RegExp(`http://2weeks.io/pickvs`), new workbox.strategies.NetworkFirst());

workbox.routing.registerRoute(
  ({ event }) => event.request.mode === 'navigate',
  async function() {
    return caches
      .match(workbox.precaching.getCacheKeyForURL(pageUrl))
      .then(response => {
        return response || fetch(pageUrl);
      })
      .catch(err => {
        return fetch(pageUrl);
      });
  }
);
