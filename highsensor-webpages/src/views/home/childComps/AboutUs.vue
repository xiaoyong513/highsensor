<template>
  <div class="about-us-wrapper">
    <div class="about-us-title">
      <div class="container">
        <h3 class="comm-title">关于我们</h3>
      </div>
    </div>

    <div class="about-us-content">
      <div class="container">
        <div class="left-box">
          <div class="center">
            <div class="center-all">
              <h4 class="left-title">北京高森感应技术有限公司</h4>
              <h5 class="left-desc">INDUSTRIAL INVESTMENT</h5>
              <p class="link"></p>
            </div>
            <p class="all-desc">
              集团成立于2001年6月，是市政府直属的国有全资大型投资集团。经过这些年的不断发展壮大，截至目前，集团公司拥有控参股企业54家，有限合伙企业6家，职工近3万余名，合并资产总额812.48亿元，获得AAA信用等级及“中国企业500强”称号。
              <br />实业投资集团聚焦先进装备制造、数字经济、新能源新材料、医疗健康、循环经济、产业园区建设等行业，以产业投资和资本运作为抓手，形成对行业领军企业的影响力和控制力。其中橡胶集团有限公司、纸业集团有限公司、高分子材料股份有限公司、油漆有限公司、轻机实业有限公司等均处于国内和行业领先地位。
            </p>
          </div>
        </div>
        <div class="right-box">
          <div class="about-us-video">
            <p style="text-align: center">
              <about-us-video-player :options="videoOptions" />
            </p>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import AboutUsVideoPlayer from "@/components/content/video/aboutus/AboutUsVideoPlayer";
export default {
  name: "AboutUs",
  components: {
    AboutUsVideoPlayer
  },
  props: {
    videoOptions: {
      type: Object,
      default() {
        return {};
      }
    }
  },
  data() {
    return {};
  },
  computed: {},
  created() {},
  methods: {}
};
</script>

<style lang="less">
.about-us-wrapper {
  .about-us-title {
    text-align: center;
    padding-bottom: 0px;
    background: #022266;
    padding-top: 50px;
    text-align: center;
    .container {
      .comm-title {
        font-size: 36px;
        color: white;
        font-weight: 30;
        &::after {
          display: block;
          content: "";
          width: 80px;
          height: 5px;
          margin: 25px auto 0;
          background-color: #fff;
        }
      }
    }
  }

  .about-us-content {
    background-image: url("../../../assets/img/home/bg/beijing001.jpg");
    background-repeat: no-repeat;
    background-position: center;
    background-size: cover;
    padding: 50px 0;
    .container {
      display: flex;
      .left-box {
        float: left;
        width: 50%;
        .center {
          text-align: left;
          .center-all {
            .link {
              display: block;
              content: "";
              width: 10%;
              height: 2px;
              margin-left: 0;
              background-color: #fff;
              // transition: 1s;
              transition: all 0.4s ease-in-out;
            }
            &:hover .link {
              width: 100%;
            }
          }
          .left-title {
            font-size: 34px;
            line-height: 50px;
            font-weight: normal;
            color: #ffffff;
          }
          .left-desc {
            font-size: 21px;
            line-height: 40px;
            color: #ffffff;
            font-family: "NotoSansHans";
            font-weight: normal;
          }
        }
        .all-desc {
          color: #ffffff;
          font-size: 16px;
          line-height: 200%;
        }
      }
      .right-box {
        float: left;
        padding-left: 20px;
        width: 50%;
        display: flex;
        flex-flow: column;
        justify-content: space-evenly;
        .about-us-video {
          width: 100%;
          max-width: 100%;
          font-size: 16px;
          line-height: 1.8;

          video {
            outline: none;
            max-width: 100% !important;
          }
          .vjs-big-play-button {
            font-size: 2.5em;
            line-height: 2.3em;
            height: 2.5em;
            width: 2.5em;
            -webkit-border-radius: 2.5em;
            -moz-border-radius: 2.5em;
            border-radius: 2.5em;
            background-color: #73859f;
            background-color: rgba(115, 133, 159, 0.5);
            border-width: 0.15em;
            margin-top: -1.25em;
            margin-left: -1.75em;
          }
          /* 中间的播放箭头 */
          .vjs-big-play-button .vjs-icon-placeholder {
            font-size: 1.63em;
          }
          /* 加载圆圈 */
          .vjs-loading-spinner {
            font-size: 2.5em;
            width: 2em;
            height: 2em;
            border-radius: 1em;
            margin-top: -1em;
            margin-left: -1.5em;
          }
        }
      }
    }
  }
}
</style>