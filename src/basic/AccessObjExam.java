package basic;

import com.eightcruz.javastudy.AccessObj;

public class AccessObjExam extends AccessObj {
    public static void main(String[] args) {
        AccessObjExam obj = new AccessObjExam();
        System.out.println(obj.p);
        System.out.println(obj.p2);
//        System.out.println(obj.k); -> 접근제한자가 dafault인 경우엔 다른 패키지에서 접근 불가
//        System.out.println(obj.i); -> 접근제한자가 private인 경우엔 다른 클래스에서 접근 불가
    }
}
