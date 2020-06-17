// import "@babel/polyfill";
import Vue from 'vue'
import App from './App.vue'
import router from './router'
// import VideoPlayer from 'vue-video-player'
import Video from "video.js"
import 'video.js/dist/video-js.css'
import VideoPlayer from 'vue-video-player'
// require('video.js/dist/video-js.css')
require('vue-video-player/src/custom-theme.css')
// import Es6Promise from 'es6-promise' 
// require('es6-promise').polyfill() 
// Es6Promise.polyfill()
Vue.config.productionTip = false
Vue.prototype.$video=Video
Vue.use(VideoPlayer)
new Vue({
  render: h => h(App),
  router
}).$mount('#app')
