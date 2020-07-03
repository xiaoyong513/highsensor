import {request} from './request'
const api_name = '/home'
// /highesnsor
export default {
  getHomeInfo() {
    return request({
      url: `${api_name}` + '/info'
    })
  },
}