<template>
  <div class="news-wrapper">
    <div class="container">
      <!-- 大标题 -->
      <h3 class="comm-title">经营产业</h3>
      <!-- 描述文字 -->
      <p
        class="comm-info"
      >集团成立于2001年6月，是市政府直属的国有全资大型投资集团。经过这些年的不断发展壮大，截至目前，集团公司拥有控参股企业54家，有限合伙企业6家，职工近3万余名，合并资产总额812.48亿元，获得AAA信用等级及“中国企业500强”称号。</p>
    </div>

    <!-- <div>
        <ul>
          <li v-for="item in news" :key="item.id">
            <img :src="item.image" alt />
            <div>
              <p>{{item.time}}</p>
              <a :href="item.href">{{item.title}}</a>
            </div>
            <div>
              <p>作为市属大型国有企业，实业集团在实现高质量发展的同时，一如既往践行着“为社会各界送温暖、让困难群众沐春风”的承诺，积极参与春风行动和各项社会公益慈善事业，履好社会责任、扛起国企担当。实业集团连续15年...</p>
            </div>
          </li>
        </ul>
    </div>-->
    <div class="news-list">
      <div class="container">
        <swiper class="swiper" :options="swiperOption">
          <swiper-slide v-for="(item) in news" :key="item.id">
            <div class="news-wrapper">
              <div class="news-img">
                <img :src="item.image" alt />
              </div>
              <div class="news-text">
                <p class="news-time">{{item.time}}</p>
                <a href="#">
                  <h4 class="news-title">{{item.title}}</h4>
                </a>
                <div class="news-info">
                  <p>{{item.info}}</p>
                </div>
                <div class="news-more">
                  <a href="#">了解详情</a>
                </div>
              </div>
            </div>
          </swiper-slide>
          <!-- <div class="swiper-pagination" slot="pagination"></div> -->
          <div class="swiper-button-prev swiper-news" slot="button-prev"></div>
          <div class="swiper-button-next swiper-news" slot="button-next"></div>
        </swiper>
      </div>
    </div>
  </div>
</template>

<script>
import { Swiper, SwiperSlide } from "vue-awesome-swiper";
import "swiper/css/swiper.css";
export default {
  name: "News",
  components: {
    Swiper,
    SwiperSlide
  },
  props: {
    news: {
      type: Array,
      default() {
        return [];
      }
    }
  },
  data() {
    return {
      swiperOption: {
        // effect: "fade", //切换效果
        // effect: "cube",
        centeredSlides: true,
        speed: 800,
        slidesPerView: 1,
        spaceBetween: 30,
        loop: true,
        // pagination: {
        //   el: ".swiper-pagination",
        //   clickable: true
        //   // type: "progressbar"
        // },
        navigation: {
          nextEl: ".swiper-button-next.swiper-news",
          prevEl: ".swiper-button-prev.swiper-news"
        }
      }
    };
  },
  computed: {},
  created() {},
  methods: {}
};
</script>

<style lang="less" scoped>
.news-wrapper {
  //背景颜色
  background: #022266;
  // 标题以及内容
  position: relative;
  display: block;
  overflow: hidden;
  margin: 0;
  padding: 0;
  .container {
    padding-top: 70px;
    text-align: center;
    // 标题
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
    // 内容
    .comm-info {
      text-align: center;
      font-size: 16px;
      color: #ffffff;
      line-height: 150%;
      margin: 10px auto;
    }
  }
  .news-list {
    background: url("../../../assets/img/home/bg/beijing001.jpg");
    background-position: center;
    position: relative;
    background-size: cover;
    padding-bottom: 50px;
    .container {
      .swiper {
        .swiper-slide {
          width: 1084px;
          .news-wrapper {
            position: relative;
            // width: 1000px;
            margin: 0 100px;
            background-color: #ffffff;
            .news-img {
              position: relative;
              width: 50%;
              float: left;
              overflow: hidden;
              z-index: 9;
              img {
                width: 100%;
                transform: scale(1);
                transition: 0.4s;
                display: block;
              }
            }
            .news-text {
              text-align: left;
              position: relative;
              width: 49.5%;
              float: right;
              padding: 40px;
              box-sizing: border-box;
              p.news-time {
                font-size: 12px;
                color: #666666;
              }
              .news-title {
                color: #212121;
                // h4 {
                font-size: 1.286rem;
                margin-top: 11px;
                margin-bottom: 11px;
                font-weight: 400;
                line-height: 1.2;
                display: block;
                // margin-block-start: 1.33em;
                // margin-block-end: 1.33em;
                // margin-inline-start: 0px;
                // margin-inline-end: 0px;
                // }
              }
              .news-info {
                p {
                  font-size: 14px;
                  white-space: pre-line;
                  text-align: justify;
                  color: #666666;
                }
              }
              .news-more {
                position: relative;
                padding-top: 25px;
                z-index: 9;
                a {
                  color: #022266;
                  font-size: 14px;
                }
              }
            }
          }
        }
      }
    }
  }
}
</style>