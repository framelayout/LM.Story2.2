package com.dawn.lmstory22.Bean;

import java.util.List;

/**
 * Created by Administrator on 2017/2/25.
 */
public class GetStory {

    /**
     * result : 1
     * msg : 获取数据成功
     * data : [{"id":"8294","story_time":"1477053403","story_info":"寂寞我的天。","pics":["20161021/580a0bdb7d4de.jpg"],"uid":"5682","lng":"23.4","lat":"34","city":"日本人","readcount":"10818","comment":"90","user":{"id":"5682","username":"xujun","usersex":"0","useremail":"jxnjjcjxknxn","nickname":"爸爸","birthday":"dchjydv","portrait":"20161020/5808e02aeccc6.jpg","signature":null}},{"id":"8425","story_time":"1477490552","story_info":"时间是不是全都是1970年1月18呀","pics":null,"uid":"6115","lng":"39.92","lat":"116.46","city":"碉堡","readcount":"10184","comment":"28","user":{"id":"6115","username":"15141661","usersex":"0","useremail":"479990511@qq.com","nickname":"来壶灵感","birthday":"1996-3-6","portrait":"20161030/5815d674971f3.jpg","signature":"玛德法科尔"}},{"id":"7809","story_time":"1476956343","story_info":"曾经有一份真挚的爱情才在我面前，但是我没有珍惜，知道失去后，才追悔莫及，草","pics":["20161020/580890b763c9a.jpg"],"uid":"5603","lng":"104","lat":"130","city":"成都青羊区","readcount":"4351","comment":"86","user":{"id":"5603","username":"juneandsherry","usersex":"1","useremail":"619324594@qq.com","nickname":"SherryLover","birthday":"2016-10-10","portrait":null,"signature":null}},{"id":"7658","story_time":"1476932059","story_info":"呵呵。。。。努力努力在努力","pics":["20161020/580831dbe5e6e.jpg","20161020/580831dbe6b75.jpg"],"uid":"5484","lng":null,"lat":null,"city":null,"readcount":"3280","comment":"10527","user":{"id":"5484","username":"wyhcql","usersex":"1","useremail":"610993926@QQ.com","nickname":"彭廷刚","birthday":"19930101","portrait":"20161020/580883472be09.jpg","signature":null}},{"id":"7913","story_time":"1477011333","story_info":"送我上热门。","pics":["20161021/580967858f13a.jpg"],"uid":"5682","lng":"23.4","lat":"34","city":"日本人","readcount":"3079","comment":"20","user":{"id":"5682","username":"xujun","usersex":"0","useremail":"jxnjjcjxknxn","nickname":"爸爸","birthday":"dchjydv","portrait":"20161020/5808e02aeccc6.jpg","signature":null}},{"id":"6558","story_time":"1475135047","story_info":"我是小波波","pics":["20160929/57ecc6477a9e0.jpg","20160929/57ecc6477c790.jpg","20160929/57ecc6477d284.jpg"],"uid":"4919","lng":"123.74","lat":"23.4","city":"成都","readcount":"2586","comment":"2137","user":{"id":"4919","username":"hoo123","usersex":"1","useremail":"hhgfdfg@qq.com","nickname":"hoo1234","birthday":"1000-01-01","portrait":"20160929/57ed056884ebd.jpg","signature":"111"}},{"id":"7368","story_time":"1475337922","story_info":"国庆真无聊啊！!!!","pics":["20161002/57efdec2335bb.jpg"],"uid":"5271","lng":"104.05201","lat":"30.670542","city":"成都市","readcount":"2229","comment":"21","user":{"id":"5271","username":"sink","usersex":"0","useremail":"aaaa@Sina.com","nickname":"sink","birthday":"1998-05-23","portrait":"20160929/57ecf6b091118.jpg","signature":"哈哈"}},{"id":"6168","story_time":"1475066338","story_info":"this is 啊test","pics":null,"uid":"4919","lng":"18.00","lat":"19.00","city":"北京","readcount":"1795","comment":"60","user":{"id":"4919","username":"hoo123","usersex":"1","useremail":"hhgfdfg@qq.com","nickname":"hoo1234","birthday":"1000-01-01","portrait":"20160929/57ed056884ebd.jpg","signature":"111"}},{"id":"8785","story_time":"1477645611","story_info":"啦咔咔","pics":null,"uid":"6219","lng":"56.12","lat":"45.6","city":"成都","readcount":"766","comment":"2","user":{"id":"6219","username":"woshichen","usersex":"0","useremail":"794400859@qq.com","nickname":"啦啦啦","birthday":"2001-10-9","portrait":"20161031/5816deb9537c2.jpg","signature":"哇呀呀"}},{"id":"6880","story_time":"1475181723","story_info":"夜不能寐","pics":["20160930/57ed7c9b14e3e.jpg","20160930/57ed7c9b170ca.jpg","20160930/57ed7c9b17698.jpg","20160930/57ed7c9b17e30.jpg"],"uid":"5139","lng":"0.0","lat":"0.0","city":"null","readcount":"686","comment":"20","user":{"id":"5139","username":"qazxsw","usersex":"0","useremail":"395002558@qq.com","nickname":"河童之夏","birthday":"1993-10-28","portrait":"20161008/57f8bb1529f39.jpg","signature":"诺克萨斯"}}]
     */

    private int result;
    private String msg;
    private List<DataBean> data;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 8294
         * story_time : 1477053403
         * story_info : 寂寞我的天。
         * pics : ["20161021/580a0bdb7d4de.jpg"]
         * uid : 5682
         * lng : 23.4
         * lat : 34
         * city : 日本人
         * readcount : 10818
         * comment : 90
         * user : {"id":"5682","username":"xujun","usersex":"0","useremail":"jxnjjcjxknxn","nickname":"爸爸","birthday":"dchjydv","portrait":"20161020/5808e02aeccc6.jpg","signature":null}
         */

        private String id;
        private String story_time;
        private String story_info;
        private String uid;
        private String lng;
        private String lat;
        private String city;
        private String readcount;
        private String comment;
        private UserBean user;
        private List<String> pics;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getStory_time() {
            return story_time;
        }

        public void setStory_time(String story_time) {
            this.story_time = story_time;
        }

        public String getStory_info() {
            return story_info;
        }

        public void setStory_info(String story_info) {
            this.story_info = story_info;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getReadcount() {
            return readcount;
        }

        public void setReadcount(String readcount) {
            this.readcount = readcount;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public List<String> getPics() {
            return pics;
        }

        public void setPics(List<String> pics) {
            this.pics = pics;
        }

        public static class UserBean {
            /**
             * id : 5682
             * username : xujun
             * usersex : 0
             * useremail : jxnjjcjxknxn
             * nickname : 爸爸
             * birthday : dchjydv
             * portrait : 20161020/5808e02aeccc6.jpg
             * signature : null
             */

            private String id;
            private String username;
            private String usersex;
            private String useremail;
            private String nickname;
            private String birthday;
            private String portrait;
            private Object signature;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getUsersex() {
                return usersex;
            }

            public void setUsersex(String usersex) {
                this.usersex = usersex;
            }

            public String getUseremail() {
                return useremail;
            }

            public void setUseremail(String useremail) {
                this.useremail = useremail;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public String getPortrait() {
                return portrait;
            }

            public void setPortrait(String portrait) {
                this.portrait = portrait;
            }

            public Object getSignature() {
                return signature;
            }

            public void setSignature(Object signature) {
                this.signature = signature;
            }
        }
    }
}
