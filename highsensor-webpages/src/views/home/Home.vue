<template>
  <div id="home">
    <!-- 轮播图 -->
    <!-- <fade /> -->
    <home-swiper :banner="banner" />
    <!-- 经营产业 -->
    <industry :industry="industry" />
    <!-- 产品展示 -->
    <product-list :product="product" />
    <!-- 新闻中心 -->
    <news :news="news" />
    <!-- 关于我们 -->
    <about-us :videoOptions="videoOptions" />
  </div>
</template>

<script>
import HomeSwiper from "./childComps/HomeSwiper";
import Industry from "./childComps/Industry";
import AboutUs from "./childComps/AboutUs";
import ProductList from "./childComps/ProductList";
import News from "./childComps/News";

import home from "network/home"
export default {
  name: "Home",
  components: {
    HomeSwiper,
    Industry,
    AboutUs,
    ProductList,
    News,
  },
  data() {
    return {
      banner: {},
      industry: {},
      product: {},
      banners: [
        {
          id: 1,
          image: require("@/assets/img/home/swiper/swiper01.jpg")
        },
        {
          id: 2,
          image: require("@/assets/img/home/swiper/swiper02.jpg")
        }
      ],
      industries: [
        {
          id: 1,
          router: "/icoach",
          image: require("@/assets/img/home/industry/industry001.jpg")
        },
        {
          id: 2,
          router: "/solution?#car",
          image: require("@/assets/img/home/industry/industry002.jpg")
        },
        {
          id: 3,
          router: "/solution?#motorcycle",
          image: require("@/assets/img/home/industry/industry003.jpg")
        }
      ],
      products: [
        {
          id: 1,
          image: require("@/assets/img/home/product/product001.jpg"),
          title: "看齐闻天下1",
          info:
            "【太平洋汽车网 行业频道】日前，前锤子科技CEO罗永浩（江湖人称“老罗”）发微博“狂吹”了一波理想ONE而引发了网友热议。据罗永浩表示，因为直播带货效果还不错，公司为其配一辆代步车，预算是500万以下任选，而老罗最终选择了售价为30多万的理想ONE，并宣称，“理想ONE是你能在这个价位买到的全世界最好的车，即使是跟比它（理想ONE）贵几倍的车比，它也几乎是完全没有对手的。”"
        },
        {
          id: 2,
          image: require("@/assets/img/home/product/product002.jpg"),
          title: "看齐闻天下2",
          info:
            "【太平洋汽车网 行业频道】日前，前锤子科技CEO罗永浩（江湖人称“老罗”）发微博“狂吹”了一波理想ONE而引发了网友热议。据罗永浩表示，因为直播带货效果还不错，公司为其配一辆代步车，预算是500万以下任选，而老罗最终选择了售价为30多万的理想ONE，并宣称，“理想ONE是你能在这个价位买到的全世界最好的车，即使是跟比它（理想ONE）贵几倍的车比，它也几乎是完全没有对手的。”"
        },
        {
          id: 3,
          image: require("@/assets/img/home/product/product003.jpg"),
          title: "看齐闻天下3",
          info:
            "【太平洋汽车网 行业频道】日前，前锤子科技CEO罗永浩（江湖人称“老罗”）发微博“狂吹”了一波理想ONE而引发了网友热议。据罗永浩表示，因为直播带货效果还不错，公司为其配一辆代步车，预算是500万以下任选，而老罗最终选择了售价为30多万的理想ONE，并宣称，“理想ONE是你能在这个价位买到的全世界最好的车，即使是跟比它（理想ONE）贵几倍的车比，它也几乎是完全没有对手的。”"
        },
        {
          id: 4,
          image: require("@/assets/img/home/product/product004.jpg"),
          title: "看齐闻天下4",
          info:
            "【太平洋汽车网 行业频道】日前，前锤子科技CEO罗永浩（江湖人称“老罗”）发微博“狂吹”了一波理想ONE而引发了网友热议。据罗永浩表示，因为直播带货效果还不错，公司为其配一辆代步车，预算是500万以下任选，而老罗最终选择了售价为30多万的理想ONE，并宣称，“理想ONE是你能在这个价位买到的全世界最好的车，即使是跟比它（理想ONE）贵几倍的车比，它也几乎是完全没有对手的。”"
        },
        {
          id: 5,
          image: require("@/assets/img/home/product/product005.jpg"),
          title: "看齐闻天下5",
          info:
            "【太平洋汽车网 行业频道】日前，前锤子科技CEO罗永浩（江湖人称“老罗”）发微博“狂吹”了一波理想ONE而引发了网友热议。据罗永浩表示，因为直播带货效果还不错，公司为其配一辆代步车，预算是500万以下任选，而老罗最终选择了售价为30多万的理想ONE，并宣称，“理想ONE是你能在这个价位买到的全世界最好的车，即使是跟比它（理想ONE）贵几倍的车比，它也几乎是完全没有对手的。”"
        }
      ],
      news: {},
      // news: [
      //   {
      //     id: 1,
      //     time: "2020-06-01",
      //     image: require("@/assets/img/home/news/news001.jpg"),
      //     title: "爽肤水01",
      //     info:
      //       "【太平洋汽车网 行业频道】日前，前锤子科技CEO罗永浩（江湖人称“老罗”）发微博“狂吹”了一波理想ONE而引发了网友热议。据罗永浩表示，因为直播带货效果还不错，公司为其配一辆代步车，预算是500万以下任选，而老罗最终选择了售价为30多万的理想ONE，并宣称，“理想ONE是你能在这个价位买到的全世界最好的车，即使是跟比它（理想ONE）贵几倍的车比，它也几乎是完全没有对手的。”",

      //     href: "https://www.metinfo.cn/product/demo.php?skin_name=mui857"
      //   },
      //   {
      //     id: 2,
      //     time: "2020-06-03",
      //     image: require("@/assets/img/home/news/news002.jpg"),
      //     title: "胜多负少从02",
      //     info:
      //       "【太平洋汽车网 行业频道】日前，前锤子科技CEO罗永浩（江湖人称“老罗”）发微博“狂吹”了一波理想ONE而引发了网友热议。据罗永浩表示，因为直播带货效果还不错，公司为其配一辆代步车，预算是500万以下任选，而老罗最终选择了售价为30多万的理想ONE，并宣称，“理想ONE是你能在这个价位买到的全世界最好的车，即使是跟比它（理想ONE）贵几倍的车比，它也几乎是完全没有对手的。”",

      //     href: "https://www.metinfo.cn/product/demo.php?skin_name=mui857"
      //   },
      //   {
      //     id: 3,
      //     time: "2020-06-07",
      //     image: require("@/assets/img/home/news/news003.jpg"),
      //     title: "胜多负少的电死的地方03",
      //     info:
      //       "【太平洋汽车网 行业频道】日前，前锤子科技CEO罗永浩（江湖人称“老罗”）发微博“狂吹”了一波理想ONE而引发了网友热议。据罗永浩表示，因为直播带货效果还不错，公司为其配一辆代步车，预算是500万以下任选，而老罗最终选择了售价为30多万的理想ONE，并宣称，“理想ONE是你能在这个价位买到的全世界最好的车，即使是跟比它（理想ONE）贵几倍的车比，它也几乎是完全没有对手的。”",
      //     href: "https://www.metinfo.cn/product/demo.php?skin_name=mui857"
      //   }
      // ],
      videoOptions: {
        controls: true,
        muted: true,
        sources: [
          {
            src: require("@/assets/video/home/aboutus/about-us.mp4"),
            type: "video/mp4"
          }
        ],
        fluid: true
        // fill: true
        //设置视频播放器的显示宽度（以像素为单位）
        // width: "630px",
        //设置视频播放器的显示高度（以像素为单位）
        // height: "318px",
        // loop: true,
        // autoplay: true,
      }
    };
  },
  computed: {},
  mounted() {},
  created() {
    this.getHomeInfo();
  },
  methods: {
    swiperImageLoad() {
      // 获取tabControl的offSetTop
      // 所有组件都有一个属性$el, 用于获取组件中的元素
      // this.tabOffsetTop = this.$refs.tabControl2.$el.offsetTop;
    },
    getHomeInfo() {
      home.getHomeInfo().then(resp => {
        this.banner = resp.data.homePage.banner 
        this.industry = resp.data.homePage.industry
        this.product = resp.data.homePage.product
        this.news = resp.data.homePage.news
      })
    }
  }
};
</script>

<style scoped>
</style>