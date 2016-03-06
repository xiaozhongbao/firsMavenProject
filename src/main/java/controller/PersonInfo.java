package controller;

/**
 * @author xiaozhongbao
 * @date 16-3-6
 */
public class PersonInfo implements ITell{


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

        @Override
         public void tellSecrite() {
          System.out.println(toString());
    }
}

interface  ITell{
         void tellSecrite();
}
class Server{

    public void makeSafe(){
        System.out.println("it is safe");
    }
    public void clean(){
        System.out.println("clean the dev");
    }
}