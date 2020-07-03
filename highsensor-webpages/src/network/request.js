import axios from 'axios'
export function request(config) {

  // 创建实例
  const instance = axios.create({
    baseURL: "http://62.234.170.158:8080/highsensor",
    timeout: 5000
  })

  // 拦截器
  instance.interceptors.request.use(
    config => {
      // 请求在页面中显示求图标
      return config
     },
    err => { 
      // console.log(err);
    }
  )
  // 相应拦截
  instance.interceptors.response.use(
    response => {
      return response.data
    }, 
    error => {
      // console.log(errror);
    }
    )
  // 发送真正的请求
  return instance(config)
}
// export function request(config) {
//   return new Promise((resolve, reject) => {
//     // 创建实例
//     const instance = axios.create({
//       baseURL: "http://mock.studyinghome.com/mock/5e91e0d5301a4f07a0c8a8f6",
//       timeout: 5000
//     })

//     instance(config)
//       .then(res => {
//         resolve(res)
//       }).catch(err => {
//         reject(err)
//       })
//   })
// }

// export function request(config) {
//   // 创建实例
//   const instance = axios.create({
//     baseURL: "http://mock.studyinghome.com/mock/5e91e0d5301a4f07a0c8a8f6",
//     timeout: 5000
//   })

//     instance(config.baseConfig)
//     .then(res => {
//       config.success(res)
//     }).catch(err => {
//       config.failure(err)
//     })
// }

// export function request(config, success, failure) {
//   // 创建实例
//   const isntance = axios.create({
//     baseURL: "http://mock.studyinghome.com/mock/5e91e0d5301a4f07a0c8a8f6",
//     timeout: 5000
//   })

//     instance(config)
//     .then(res => {
//       success(res)
//     }).catch(err => {
//       failure(err)
//     })
// }