package operator;

public class TestEncryption2 {
    public static void main(String[] args) {
        char secret = '8';
        //获取每个字符的值
        char a1 ='十',a2='点',a3='进',a4='攻';
        System.out.println("加密前原文:" + a1 + a2 +a3 + a4);
        //和8异或取值
        a1 = (char)(a1^secret);
        a2 = (char)(a2^secret);
        a3 = (char)(a3^secret);
        a4 = (char)(a4^secret);

        //密文
        System.out.println("密码:"+ a1+a2+a3+a4);

        //解密
        a1 = (char)(a1^secret);
        a2 = (char)(a2^secret);
        a3 = (char)(a3^secret);
        a4 = (char)(a4^secret);


        System.out.println("解密后原文："+a1+a2+a3+a4);
    }
}
