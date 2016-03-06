package controller;

/**
 * @author xiaozhongbao
 * @date 16-3-6
 */
public class PersonInfo {


        private String userName;
        private  int id;
        private  String age;
        private  String sex;


        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "PersonInfo{" +
                    "userName='" + userName + '\'' +
                    ", id=" + id +
                    ", age='" + age + '\'' +
                    ", sex='" + sex + '\'' +
                    '}';
        }

    }

