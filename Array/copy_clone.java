package Array;

public class copy_clone {

    public static void main(String[] args) {
        char[] copyfrom={'j','a','v','a',' ','i','s',' ','f','u','n'};
        char [] copyto = new char[10];
        copyto[0]='e';
        copyto[1]='n';
        copyto[2]='j';
        copyto[3]='o';
        copyto[4]='y';
        System.arraycopy(copyfrom, 7, copyto, 6, 4); 
        System.out.println(copyto);
    }
    
}
