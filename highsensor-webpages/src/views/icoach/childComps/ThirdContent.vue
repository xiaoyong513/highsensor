<template>
  <div class="first-video">
      <icoach-first-video-player :options="dataInfo.videoOptions" />
      <div class="left-content">
        <div class="left-content-zh">安全保障 · 辅助刹车</div>
        <div class="left-content-en">&nbsp;&nbsp;INTELLIGENT REMOTE BRAKE ASSIST</div>
      </div>

      <div class="right-content">
        <div class="right-content-first">
          <div class="right-content-zh">智能远程辅助刹车</div>
          <div class="right-content-en">INTELLIGENT REMOTE BRAKE ASSIST</div>
        </div>

        <div class="right-content-second">
          <div class="right-content-second-title">
            <div class="right-content-second-left">
              <ul class="second-left-title-conten">
                <li class="second-right-title-img-01"></li>
                <li class="second-right-title-img-02"></li>
                <li class="second-right-title-img-03"></li>
                <li class="second-right-title-img-04"></li>
              </ul>
            </div>
            <div class="right-content-second-right">
              <ul class="second-right-title-conten">
                <li class="second-right-title-img-05"></li>
                <li class="second-right-title-img-06"></li>
                <li class="second-right-title-img-07"></li>
                <li class="second-right-title-img-08"></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
</template>

<script>
import IcoachFirstVideoPlayer from "@/components/content/video/icoach/IcoachFirstVideoPlayer";
export default {
  name:"ThirdContent",
  components: {
    IcoachFirstVideoPlayer,
  },
  props: {
    dataInfo: {
      type: Object,
      default() {
        return {}
      }
    }
  },
  data() {
    return {

    }
  },
  computed: {},
  created() {
  },
  methods: {},
}
</script>

<style lang="less">
.first-video {
    position: relative;
    .video-js.vjs-ended .vjs-big-play-button,
    .video-js.vjs-paused .vjs-big-play-button,
    .vjs-paused.vjs-has-started.vjs-custom-skin
      > .video-js
      .vjs-big-play-button {
      display: none;
    }

    .left-content {
      float: left;
      height: 100%;
      width: 18%;
      position: absolute;
      top: 0;
      left: 0;
      padding-top: 12vmax;
      .left-content-zh {
        color: rgb(255, 255, 255);
        font-size: 26.3056px;
        font-family: AlibabaPuHuiTiR;
        font-weight: 400;
        width: 100%;
        text-align: right;
        height: 1.6vw;
      }
      .left-content-en {
        color: rgb(255, 255, 255);
        font-size: 10.5222px;
        font-family: AlibabaPuHuiTiR;
        font-weight: 400;
        width: 100%;
        text-align: right;
        line-height: 30px;
      }
    }

    .right-content {
      float: left;
      width: 82%;
      height: 100%;
      padding-top: 12vmax;
      position: absolute;
      margin-left: 18%;
      top: 0;
      right: 0;
      .right-content-first {
        height: 50%;
        width: 100%;
        color: #ffffff;
        text-align: right;
        padding-right: 5%;
        .right-content-zh {
          color: rgb(255, 255, 255);
          font-size: 42.0889px;
          height: 52.6111px;
          line-height: 52.6111px;
          font-family: PingFang SC;
          font-weight: bold;
        }
        .right-content-en {
          color: rgb(255, 255, 255);
          font-size: 15.7833px;
          height: 17.537px;
          line-height: 17.537px;
          font-family: PingFang SC;
          font-weight: 400;
        }
      }
      .right-content-second {
        height: 50%;
        width: 100%;
        color: #ffffff;
        text-align: right;
        padding-top: 50px;
        padding-right: 5%;
        .right-content-second-title {
          width: 541.894px;
          height: 292.869px;

          float: right;
          .right-content-second-left .second-left-title-conten,
          .right-content-second-right .second-right-title-conten {
            li {
              display: block;
              height: 61.3796px;
              margin-bottom: 25px;
              &:hover {
                -webkit-animation: rock 0.5s 0s ease-in-out;
                -moz-animation: rock 0.5s 0s ease-in-out;
                -ms-animation: rock 0.5s 0s ease-in-out;
                -o-animation: rock 0.5s 0s ease-in-out;
                animation: rock 0.5s 0s ease-in-out;
              }
              @-webkit-keyframes rock {
                0% {
                  -webkit-transform: rotate(-3deg);
                  transform: rotate(-3deg);
                }
                25% {
                  -webkit-transform: rotate(0);
                  transform: rotate(0);
                }
                50% {
                  -webkit-transform: rotate(3deg);
                  transform: rotate(3deg);
                }
                100% {
                  -webkit-transform: rotate(0);
                  transform: rotate(0);
                }
              }
              @keyframes rock {
                0% {
                  -webkit-transform: rotate(-3deg);
                  transform: rotate(-3deg);
                }
                25% {
                  -webkit-transform: rotate(0);
                  transform: rotate(0);
                }
                50% {
                  -webkit-transform: rotate(3deg);
                  transform: rotate(3deg);
                }
                100% {
                  -webkit-transform: rotate(0);
                  transform: rotate(0);
                }
              }
            }
          }
          .right-content-second-left {
            width: 306.898px;
            height: 292.869px;
            float: left;
            .second-left-title-conten {
              .second-right-title-img-01 {
                background-image: url("../../../assets/img/icoach/fourpage_title0_01.png");
                background-size: 100% 100%;
              }
              .second-right-title-img-02 {
                background-image: url("../../../assets/img/icoach/fourpage_title0_02.png");
                background-size: 100% 100%;
              }
              .second-right-title-img-03 {
                background-image: url("../../../assets/img/icoach/fourpage_title0_03.png");
                background-size: 100% 100%;
              }
              .second-right-title-img-04 {
                background-image: url("../../../assets/img/icoach/fourpage_title0_04.png");
                background-size: 100% 100%;
              }
            }
          }
          .right-content-second-right {
            width: 210.444px;
            height: 292.869px;
            margin-left: 24.5519px;
            float: left;
            .second-right-title-conten {
              .second-right-title-img-05 {
                background-image: url("../../../assets/img/icoach/fourpage_title0_05.png");
                background-size: 100% 100%;
              }
              .second-right-title-img-06 {
                background-image: url("../../../assets/img/icoach/fourpage_title0_06.png");
                background-size: 100% 100%;
              }
              .second-right-title-img-07 {
                background-image: url("../../../assets/img/icoach/fourpage_title0_07.png");
                background-size: 100% 100%;
              }
              .second-right-title-img-08 {
                background-image: url("../../../assets/img/icoach/fourpage_title0_08.png");
                background-size: 100% 100%;
              }
            }
          }
        }
      }
    }
  }
</style>