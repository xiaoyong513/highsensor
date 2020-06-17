<template>
  <div class="swiper-video-wrapper">
    <video id="swiper-video-player" class="video-js">
      <source :src="this.options.sources[0].src" />
    </video>

    <div class="left-content">
      <div class="left-content-zh">安全保障 · 辅助刹车</div>
      <div class="left-content-en">&nbsp;&nbsp;INTELLIGENT REMOTE BRAKE ASSIST</div>
    </div>

    <div class="right-content">
      <div class="right-content-zh">智能远程辅助刹车</div>
      <div class="right-content-en">INTELLIGENT REMOTE BRAKE ASSIST</div>
    </div>
  </div>
</template>

<script>
import videojs from "video.js";
export default {
  name: "SwiperVideo",
  props: {
    options: {
      type: Object,
      default() {
        return {};
      }
    }
  },
  data() {
    return {};
  },
  mounted() {
    this.initVideo();
  },
  methods: {
    initVideo() {
      console.log(this.options.sources[0].src);
      
      //初始化视频方法 循环列表获取每个视频的id
      let myPlayer = this.$video(swiperVideoPlayer, {
        //确定播放器是否具有用户可以与之交互的控件。没有控件，启动视频播放的唯一方法是使用autoplay属性或通过Player API。
        controls: true,
        //自动播放属性,muted:静音播放
        autoplay: "muted",
        //建议浏览器是否应在<video>加载元素后立即开始下载视频数据。
        preload: "auto",
        //设置视频播放器的显示宽度（以像素为单位）
        width: "800px",
        //设置视频播放器的显示高度（以像素为单位）
        height: "400px"
        //封面图
        // poster:item.pic
      });
    }
  },
  beforeDestroy() {
    if (this.myPlayer) {
      this.myPlayer.dispose();
    }
  }
};
</script>

<style scoped>
.swiper-video-wrapper {
}
.swiper-video {
  width: 100%;
  vertical-align: bottom;
}

.swiper-video-wrapper .left-content {
  /* display: flex; */
  /* position: absloute; */
  height: 1000px;
  background-color: #bfa;
  left: 0;
  right: 0;

  top: 0;
  bottom: 0;
}
</style>