<template>
  <footer class="footer-wrapper">
    <div class="qr-code">
      <div class="qr-code-title">
        <h2>扫一扫</h2>
      </div>
      <div class="qr-code-img">
        <img src="../../../assets/img/home/footer/qr.png" alt />
      </div>
    </div>
    <div class="contact-us">
      <div class="contact-us-title">
        <h2>联系我们</h2>
      </div>
      <ul class="contact-us-info">
        <li>
          <a href>
            <span><i class="fas fa-map-marker-alt"></i>总部:  北京市昌平科技园区创新路11号创业大厦8层817室</span>
          </a>
        </li>
        <li>
          <a href>
            <span><i class="fas fa-phone"></i>电话:  010- 69709881</span>
          </a>
        </li>
        <li>
          <a href>
            <span><i class="fas fa-mobile"></i>手机:  13051212050</span>
          </a>
        </li>
        <li>
          <a href>
            <span><i class="fas fa-envelope"></i>邮箱:  highseneor@126.com</span>
          </a>
        </li>
        <li>
          <a href>
            <span><i class="fas fa-globe"></i>网址:  http://www.highsensor.com</span>
          </a>
        </li>
      </ul>
    </div>
  </footer>
</template>

<script>
export default {
  name: "Footer",
  components: {},
  data() {
    return {};
  },
  computed: {},
  created() {},
  methods: {}
};
</script>

<style lang="less" scoped>
.footer-wrapper {
  display: flex;
  background-color: #333333;
  height: 280px;
  /* justify-content: center; */
  flex-flow: row;
  justify-content: space-evenly;
  padding-top: 40px;
  text-align: center;
  color: white;
  .qr-code {
    .qr-code-title {
    }
    .qr-code-img {
      margin-top: 20px;
      img {
        width: 160px;
      }
    }
  }
  .contact-us {
    .contact-us-info {
      margin-top: 20px;
      text-align: left;
      li::before {
        contain: "";
      }
      li {
        list-style: none;
        line-height: 200%;
        i {
          width: 20px;
          margin-right: 10px;
        }
        a {
          span {
            color: white;
          }
        }
      }
    }
  }
}
</style>