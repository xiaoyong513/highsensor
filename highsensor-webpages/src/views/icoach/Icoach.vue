<template>
  <div class="icoach">
    <!-- 第一块内容 -->
    <div class="first-wrapper">
      <div class="first-image">
        <img src="../../assets/img/icoach/aboutLb03.jpg" alt />
      </div>
    </div>
    <!-- 第二块内容 -->
    <div class="second-wrapper">
      <div class="second-image">
        <img src="../../assets/img/icoach/fivePageBgImg.png" alt />
      </div>
      <div class="second-tool">
        <ul class="tool-ul">
          <li>
            <div class="second-tool-img">
              <img src="../../assets/img/icoach/tianxian.png" alt />
            </div>
            <div class="second-tool-text">
              智能机器人教练 教学|评判双引擎
              <br />新一代4星8频GNSS基准站无缝漫游
            </div>
          </li>
          <li>
            <div class="second-tool-img">
              <img src="../../assets/img/icoach/yuyin.png" alt />
            </div>
            <div class="second-tool-text">
              智能机器人教练 教学|评判双引擎
              <br />新一代4星8频GNSS基准站无缝漫游
            </div>
          </li>
          <li>
            <div class="second-tool-img">
              <img src="../../assets/img/icoach/dingwei.png" alt />
            </div>
            <div class="second-tool-text">
              智能机器人教练 教学|评判双引擎
              <br />新一代4星8频GNSS基准站无缝漫游
            </div>
          </li>
          <li>
            <div class="second-tool-img">
              <img src="../../assets/img/icoach/appyun.png" alt />
            </div>
            <div class="second-tool-text">
              智能机器人教练 教学|评判双引擎
              <br />新一代4星8频GNSS基准站无缝漫游
            </div>
          </li>
          <li>
            <div class="second-tool-img">
              <img src="../../assets/img/icoach/mokuai.png" alt />
            </div>
            <div class="second-tool-text">
              智能机器人教练 教学|评判双引擎
              <br />新一代4星8频GNSS基准站无缝漫游
            </div>
          </li>
        </ul>
      </div>
    </div>
    <!-- 第三块内容 视频 -->
    <third-content :dataInfo="thirdData" />
    <!-- 第四块内容 -->
    <fourth-content :dataInfo="fourthData" />
    <!-- 第五块内容 -->
    <div class="fifth-wrapper">
      <img src="@/assets/img/icoach/5.png" alt="" style="width: 100%">
    </div>
    <!-- 第六块内容 -->
    <div class="sixth-wrapper">
      <img src="@/assets/img/icoach/6.png" alt=""  style="width: 100%">
    </div>
    <!-- 第七块内容 -->
    <seventh-content/>
  </div>
</template>

<script>
import ThirdContent from "./childComps/ThirdContent";
import FourthContent from "./childComps/FourthContent";
import SeventhContent from "./childComps/SeventhContent";
export default {
  name: "Icoach",
  components: {
    ThirdContent,
    FourthContent,

    SeventhContent
  },
  data() {
    return {
      thirdData: {
        videoOptions: {
          controls: false,
          muted: true,
          sources: [
            {
              src: require("@/assets/video/icoach/Intelligentbrake.mp4"),
              type: "video/mp4"
            }
          ],
          fluid: true,
          loop: true,
          autoplay: true
        }
      },
      fourthData: {
        phones: [
          {
            id: 1,
            image: require("@/assets/img/icoach/IPhoneX4Page.png"),
            
          },
          {
            id: 2,
            image: require("@/assets/img/icoach/IPhoneX5Page.png")
          },
          {
            id: 3,
            image: require("@/assets/img/icoach/IPhoneX6Page.png")
          }
        ]
      },
      seventhData: {

      }
    };
  },
  computed: {},
  created() {},
  methods: {}
};
</script>

<style lang="less">
.icoach {
  /* height: 100px;  */
  .first-wrapper {
    .first-image {
      img {
        width: 100%;
        vertical-align: bottom;
      }
    }
  }
  .second-wrapper {
    .second-image {
      img {
        width: 100%;
        vertical-align: bottom;
      }
    }
    .second-tool {
      background-color: #fff;
      height: 200px;
      .tool-ul {
        list-style: none;
        display: flex;
        justify-content: space-around;
        margin-top: 17.537px;
        height: 140px;
        li {
          display: block;
          text-align: center;
          transition: 0.5s;
          background: rgba(255, 255, 255, 1);
          // height: 350px;
          box-shadow: 0px 1px 10px 0px rgba(0, 0, 0, 0.1);
          .second-tool-img {
            padding-top: 15px;
            height: 79px;
            width: 100%;
            img {
              width: 50px;
              vertical-align: middle;
            }
          }
          .second-tool-text {
            height: 44px;
            width: 100%;
            font-size: 14px;
            line-height: 22px;
            height: 20px;
            font-family: PingFang SC;
            font-weight: 100;
            color: rgba(51, 51, 51, 1);
            display: table-cell;
            vertical-align: middle;
          }
          &:hover {
            transform: scale(1.1);
          }
        }
      }
    }
  }
}
</style>