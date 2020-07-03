module.exports = {
  filenameHashing: false,
  configureWebpack: {
    resolve: {
      alias: {
        'assets': '@/assets',
        'common': '@/common',
        'network': '@/network',
        'components': '@/components',
      }
    }
  },
  devServer: {
    proxy: {
      '/highsensor': {
        target: 'http://62.234.170.158:8080/highsensor',
        changeOrigin: true,
        ws: true,
        pathRewrite: {
          '^/highsensor': ''
        }
      }
    }
  }
  // chainWebpack: config => {
  //   config.rule('js').include.add(/node_modules\/(dom7|swiper)\/.*/)
  // },
  // transpileDependencies: ['iview', 'router']
}