import java.util.Scanner;

public class Summedmatrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int q=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        if(q>1 && q<=2*n){
            if(q<n-1){System.out.println(n-1);}
            else{System.out.println(2*n+1-q);}
        }
        else{System.out.println("0");}
}
}

