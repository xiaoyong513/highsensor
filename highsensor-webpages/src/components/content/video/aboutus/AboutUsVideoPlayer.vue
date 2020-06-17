<template>
  <div>
    <video ref="aboutUsVideoPlayer" class="video-js vjs-big-play-centered"></video>
  </div>
</template>

<script>
import videojs from "video.js";

export default {
  name: "VideoPlayer",
  props: {
    options: {
      type: Object,
      default() {
        return {};
      }
    }
  },
  data() {
    return {
      player: null
    };
  },
  mounted() {
    this.player = videojs(
      this.$refs.aboutUsVideoPlayer,
      this.options,
      function onPlayerReady() {
        // console.log("onPlayerReady", this);
        // this.playe.
      }
    );
  },
  beforeDestroy() {
    if (this.player) {
      this.player.dispose();
    }
  }
};
</script>

<style lang="less">

</style>