<template>
  <div>
    <video ref="icoachFirstVideoPlayer" class="video-js"></video>
  </div>
</template>

<script>
import videojs from "video.js";
export default {
  name: "IcoachFirstVideoPlayer",
  components: {},
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
      icoachPlayer: null
    };
  },
  mounted() {
    this.icoachPlayer = videojs(
      this.$refs.icoachFirstVideoPlayer,
      this.options,
      function onPlayerReady() {
        // console.log("onPlayerReady", this);
      }
    );
  },
  beforeDestroy() {
    if (this.icoachPlayer) {
      this.icoachPlayer.dispose();
    }
  }
};
</script>

<style>
</style>