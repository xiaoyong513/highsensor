<template>
  <div class="solution">
    <div class="first-content">
      <div class="first-img">
        <img src="@/assets/img/contact/联系我们.png" alt />
      </div>
    </div>

    <div class="second-content">
      <div class="car-solution" ref="car">
        <div class="car-top">
          <div class="top-first-img">
            <img src="@/assets/img/solution/car/fanguangjing.png" alt />
          </div>
          <div class="top-second-img">
            <img src="@/assets/img/solution/car/zuhetaozhuang.png" alt />
          </div>
          <div class="top-third-img">
            <img src="@/assets/img/solution/car/luchaoshengbo.png" alt />
          </div>
        </div>
        <div class="car-centor">
          <div class="car">
            <img src="@/assets/img/solution/car/car.png" alt />
          </div>
        </div>
        <div class="car-bottom">
          <div class="bottom-first-img">
            <img src="@/assets/img/solution/car/dangwei.png" alt />
          </div>
          <div class="bottom-second-img">
            <img src="@/assets/img/solution/car/zuodian.png" alt />
          </div>
          <div class="bottom-third-img">
            <img src="@/assets/img/solution/car/chuangdong.png" alt />
          </div>
        </div>
        <div class="car-title">
          <span>汽车解决方案</span>
        </div>
      </div>

      <div class="motorcycle-solution" ref="motorcycle">
        <div class="moto-top">
          <div class="top-first-img">
            <img src="@/assets/img/solution/moto/zuhetaozhuang.png" alt />
          </div>
          <div class="top-second-img">
            <img src="@/assets/img/solution/moto/toukui.png" alt />
          </div>
          <div class="top-third-img">
            <img src="@/assets/img/solution/moto/shouba.png" alt />
          </div>
        </div>
        <div class="moto-centor">
          <div class="moto">
            <img src="@/assets/img/solution//moto/moto.png" alt />
          </div>
        </div>
        <div class="moto-bottom">
          <div class="bottom-first-img">
            <img src="@/assets/img/solution/moto/jiaota.png" alt />
          </div>
          <div class="bottom-second-img">
            <img src="@/assets/img/solution/moto/zhuanggan.png" alt />
          </div>
          <div class="bottom-third-img">
            <img src="@/assets/img/solution/moto/gan.png" alt />
          </div>
        </div>
        <div class="moto-title">
          <span>摩托解决方案</span>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Solution",
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
.solution {
  .first-content {
    background-color: #fff;
    margin-bottom: 60px;
    .first-img {
      img {
        width: 100%;
      }
    }
  }
  .second-content {
    background-color: #f9f9f9;
    background-image: url("../../assets/img/solution/solutionMeteor.png");
    background-size: cover;
    background-repeat: no-repeat;
    .car-solution {
      height: 100%;
      .car-top {
        display: flex;
        width: 80%;
        margin-left: 10%;
        height: 250px;
        justify-content: space-between;
        .top-first-img {
          position: relative;
          // margin-top: 80px;
          background-image: url("../../assets/img/solution/duobianxing_blue.png");
          background-repeat: no-repeat;
          background-size: 100%;
          background-clip: content-box;
          height: 100px;
          width: 100px;
          top: 250px;
          left: 250px;
          // margin-top: 0;
          img {
            position: absolute;
            top: 20px;
            left: 10px;
            width: 80px;
          }
        }
        .top-second-img {
          position: relative;
          background-image: url("../../assets/img/solution/duobianxing_blue.png");
          background-repeat: no-repeat;
          background-size: 100%;
          background-clip: content-box;
          height: 150px;
          width: 150px;
          top: 50px;
          left: 50px;
          img {
            position: absolute;
            top: 33px;
            left: 19px;
            width: 120px;
          }
        }

        .top-third-img {
          position: relative;
          background-image: url("../../assets/img/solution/duobianxing_blue.png");
          background-repeat: no-repeat;
          background-size: 100%;
          background-clip: content-box;
          height: 150px;
          width: 150px;
          top: 150px;
          right: 150px;
          img {
            position: absolute;
            top: 25px;
            left: 15px;
            width: 120px;
          }
        }
      }
      .car-centor {
        .car {
          width: 50%;
          margin-left: 25%;
          img {
            width: 100%;
          }
        }
      }
      .car-bottom {
        display: flex;
        width: 80%;
        margin-left: 10%;
        height: 300px;
        justify-content: space-between;
        .bottom-first-img {
          position: relative;
          // margin-top: 80px;
          background-image: url("../../assets/img/solution/duobianxing_blue.png");
          background-repeat: no-repeat;
          background-size: 100%;
          background-clip: content-box;
          height: 100px;
          width: 100px;
          top: 40px;
          left: 250px;
          // margin-top: 0;
          img {
            position: absolute;
            top: 10px;
            left: 10px;
            width: 75px;
          }
        }
        .bottom-second-img {
          position: relative;
          background-image: url("../../assets/img/solution/duobianxing_blue.png");
          background-repeat: no-repeat;
          background-size: 100%;
          background-clip: content-box;
          height: 150px;
          width: 150px;
          top: 150px;
          left: 50px;
          img {
            position: absolute;
            top: 8px;
            left: 23px;
            width: 100px;
          }
        }

        .bottom-third-img {
          position: relative;
          background-image: url("../../assets/img/solution/duobianxing_blue.png");
          background-repeat: no-repeat;
          background-size: 100%;
          background-clip: content-box;
          height: 150px;
          width: 150px;
          top: 50px;
          right: 150px;
          img {
            position: absolute;
            top: 5px;
            left: 20px;
            width: 100px;
          }
        }
      }
      .car-title {
        color: #2304e0;
        text-align: center;
        font-size: 24px;
        line-height: 40px;
      }
    }
    .motorcycle-solution {
      .moto-top {
        display: flex;
        width: 80%;
        margin-left: 10%;
        height: 250px;
        justify-content: space-between;
        .top-first-img {
          position: relative;
          // margin-top: 80px;
          background-image: url("../../assets/img/solution/duobianxing_blue.png");
          background-repeat: no-repeat;
          background-size: 100%;
          background-clip: content-box;
          height: 150px;
          width: 150px;
          top: 200px;
          left: 120px;
          // margin-top: 0;
          img {
            position: absolute;
            top: 33px;
            left: 19px;
            width: 120px;
          }
        }
        .top-second-img {
          position: relative;
          background-image: url("../../assets/img/solution/duobianxing_blue.png");
          background-repeat: no-repeat;
          background-size: 100%;
          background-clip: content-box;
          height: 100px;
          width: 100px;
          top: 80px;
          left: 0;
          img {
            position: absolute;
            top: 10px;
            left: 10px;
            width: 75px;
          }
        }

        .top-third-img {
          position: relative;
          background-image: url("../../assets/img/solution/duobianxing_blue.png");
          background-repeat: no-repeat;
          background-size: 100%;
          background-clip: content-box;
          height: 150px;
          width: 150px;
          top: 200px;
          right: 200px;
          img {
            position: absolute;
            top: 40px;
            left: 15px;
            width: 120px;
          }
        }
      }
      .moto-centor {
        .moto {
          width: 50%;
          margin-left: 25%;
          img {
            width: 100%;
          }
        }
      }
      .moto-bottom {
        display: flex;
        width: 80%;
        margin-left: 10%;
        height: 300px;
        justify-content: space-between;
        .bottom-first-img {
          position: relative;
          // margin-top: 80px;
          background-image: url("../../assets/img/solution/duobianxing_blue.png");
          background-repeat: no-repeat;
          background-size: 100%;
          background-clip: content-box;
          height: 100px;
          width: 100px;
          top: 40px;
          left: 250px;
          // margin-top: 0;
          img {
            position: absolute;
            top: 10px;
            left: 15px;
            width: 65px;
          }
        }
        .bottom-second-img {
          position: relative;
          background-image: url("../../assets/img/solution/duobianxing_blue.png");
          background-repeat: no-repeat;
          background-size: contain;
          background-clip: border-box;
          justify-content: center;
          height: 150px;
          width: 150px;
          top: 150px;
          left: 50px;
          img {
            position: absolute;
            top: 4px;
            left: 50px;
            width: 50px;
          }
        }

        .bottom-third-img {
          position: relative;
          // background-image: url("../../assets/img/solution/duobianxing_blue.png");
          // background-repeat: no-repeat;
          // background-size: 100%;
          // background-clip: content-box;
          // height: 150px;
          // width: 150px;
          bottom: 250px;
          right: 200px;
          img {
            position: absolute;
            top: 5px;
            left: 20px;
            width: 50px;
          }
        }
      }
      .moto-title {
        color: #2304e0;
        text-align: center;
        font-size: 24px;
        line-height: 40px;
      }
    }
  }
}
</style>