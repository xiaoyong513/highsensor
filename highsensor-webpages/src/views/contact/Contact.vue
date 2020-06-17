<template>
  <div class="contact">
    <div class="contact-img-wrapper">
      <img src="@/assets/img/contact/联系我们.png" alt />
    </div>

    <div class="contact-company-info-wrapper">
      <div class="company-name">
        <div class="company-name-zh">
          <!-- <img src="@/assets/img/contact/联系我们zh.png" alt /> -->
          <span>北京高森感应技术有限公司</span>
        </div>
        <div class="company-name-en">
          <!-- <img src="@/assets/img/contact/联系我们en.png" alt /> -->
          <span>Beijing Highsensor Induction Technology Co., Ltd</span>
        </div>
      </div>

      <div class="company-detail-info-wrapper">
        <div class="company-qr">
          <img src="@/assets/img/contact/联系我们qr.png" alt />
        </div>
        <div class="company-addr">
          <ul>
            <li class="addr-li">
              <span>地址:</span>
              <span>北京市昌平科技园区创新路11号创业大厦8层817室</span>
            </li>
            <li class="addr-li">
              <span>电话:</span>
              <span>010- 69709881</span>
            </li>
            <li class="addr-li">
              <span>手机:</span>
              <span>13051212050</span>
            </li>
            <li class="addr-li">
              <span>QQ:</span>
              <span>603173475</span>
            </li>
            <li class="addr-li">
              <span>邮箱:</span>
              <span>highseneor@126.com</span>
            </li>
            <li class="addr-li">
              <span>网址:</span>
              <span>http://www.highsensor.com</span>
            </li>
            <li class="addr-li">
              <span>资料:</span>
              <span>https://pan.baidu.com/s/1SdYXGcNwUooX2gtvUly4gw</span>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Contact",
  components: {},
  data() {
    return {};
  },
  computed: {},
  created() {},
  methods: {}
};
</script>

<style lang="less">
.contact {
  .contact-img-wrapper {
    background-color: #fff;
    margin-bottom: 60px;
    img {
      width: 100%;
      vertical-align: bottom;
    }
  }
  .contact-company-info-wrapper {
    width: 100%;
    height: 980px;
    background-color: #f9f9f9;
    .company-name {
      // position: relative;
      padding: 50px 20% 150px 20%;
      justify-content: center;
      text-align: center;
      .company-name-zh {
        margin: 20px auto;
        // img {
        //   width: 50%;
        // }
        font-size: 45px;
        color: #000;
      }

      .company-name-en {
        // img {
        //   width: 60%;
        // }
        font-size: 35px;
        color: #291d5d;
      }
    }

    .company-detail-info-wrapper {
      display: flex;
      justify-content: center;
      .company-qr {
        margin-right: 100px;
        img {
          width: 100%;
        }
      }
      .company-addr {
        line-height: 60px;
        font-size: 18px;
        color: #000;
        font-weight: 500;
        span {
          margin-right: 10px;
        }
      }
    }
  }
}
</style>