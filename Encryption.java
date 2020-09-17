public class Encryption{
    public static void main(String[] args){
        String a = "apples";
        String b = "bananas";
        String m = "mangoes";

        char c = 'c';
        char z = 'z';

        System.out.println(c);
        System.out.println(z);


        System.out.println(a);
        System.out.println(b);
        System.out.println(m);

        System.out.println("------");

        c = (char)(c + 2);
        System.out.println(c);

        z += 15;
        // if((int)z > 126){
        //     System.out.println("value was too large, starting from the beginning");
        //     z = (char)(31 + (z - 127));
        // }
        // else if((int)z < 32){
        //     z = (char)(126 - (32 - z));
        // }
        System.out.println(z);

        z -= 15;
        // if((int)z > 126){
        //     System.out.println("value was too large, starting from the beginning");
        //     z = (char)(31 + (z - 126));
        // }
        // else if((int)z < 32){
        //     z = (char)(126 - (32 - z));
        // }
        System.out.println(z);

        char[] apples = {'a', 'p', 'p', 'l', 'e', 's'};
        System.out.println(apples);
        for(int i = 0; i < apples.length; ++i){
            apples[i] += 4;
        }
        System.out.println(apples);

        System.out.println(a.length());

        for(int i = 0; i < a.length(); ++i){
            System.out.println(a.charAt(i));
        }
        for(int i = a.length() -1; i >= 0; --i){
            System.out.print(a.charAt(i));
        }
        System.out.println();

        String s = "";
        for(int i = 65; i < 127; ++i){
            s += (char)i + " ";
        }
        System.out.println(s);

        for(int i = 0; i < 100; ++i){
            System.out.println();
        }
    }
}
