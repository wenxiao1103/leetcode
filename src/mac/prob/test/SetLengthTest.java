package mac.prob.test;

/**
 * @author xiaowen
 * @date 2020/8/26 8:24 下午
 */
public class SetLengthTest {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        sb.append('b');
        sb.append('c');
        sb.append('d');
        System.out.println(sb.toString());
        System.out.println(sb.length());
        sb.setLength(2);
        sb.append('p');
        System.out.println(sb.toString());
        System.out.println(sb.length());
    }
}
