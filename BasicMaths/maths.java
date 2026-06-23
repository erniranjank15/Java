import java.util.Scanner;

public class maths{

// Print digit you entered any order
static void printdigits(int n){

    while(n!=0){
        int digit = n%10;
        System.out.println(digit);
        n=n/10;
    }

}


// Count digits in number
static void count(int n){
    int count=0;
    while(n!=0){
        int digit = n%10;
        count++;
        n=n/10;
    }
System.out.print("Count: " + count);
}



// Sum of digits in no.
static void sumdigit(int n){
    int sum=0;
    while(n!=0){
        int digit = n%10;
        sum=sum+digit;
        n=n/10;
    }
System.out.print("Sum: " + sum);
}



// Reverse the no.
static int reverse(int n){
    int rev=0;

// ans = ans*10 + currdigit

    while(n!=0){
        int currdigit = n%10;
        rev = rev*10 + currdigit;
        n=n/10;
    }
System.out.print("Reverse: " + rev);
return rev;
}



// Palindrome no.
static void ispalindrome(int n){
    int original = n;

    int rev = reverse(n);

    if(original == rev){
        System.out.print("\nPalindrome no.");
    }
    else{
        System.out.print("\nNot Palindrome");
    }

}




// Prime no.
static boolean isprime(int n){
    
     if(n==0||n==1){
            return false;
           
    }



    for(int i=2;i<n;i++){
        if(n%i==0){
            return false;
          
        }
    }

     return true;
}




// Gcd of no.
static int getgcd(int a, int b){
    // gcd(a, b) = gcd(b, a%b)

     while(b!=0){
        int old_b = b;
        b= a%b;
        a=old_b;
     }

     int ans =a;
     
     System.out.print("GCD: " + ans);

     return ans;
}



// Lcm of no.
static void getlcm(int a, int b){
    int gcd = getgcd(a, b);
    int product=a*b;
    int lcm = product/gcd;

    System.out.print(" Lcm: " + lcm);
}



// Factorial of no.
static void fact(int n){
int fact=1;

for(int i=1; i<=n;i++){
    fact=fact*i;
}

System.out.print("Factorial of no. : " + fact);

}



// Armstrong no.
static boolean isarmstrong(int n){

    int sum=0;
    int original = n;

    while(n!=0){
        int digit=n%10;
        int pro=digit*digit*digit;
        sum=sum+pro;
        n=n/10;
     }

  if(original == sum){
    return true;
  }
  else{
    return false;
  }

}




// Perfect no.
static boolean isPerfect(int n){

    int sum=1;


  for(int i=2;i*i<=n;i++){


    if(n%i==0){

        int firstfactor=i;
        int secondfactor=n/i;
        sum = sum + firstfactor + secondfactor;


    }
  }

  if(sum == n){
    return true;
  }
  else{
    return false;
  }

}





// Print all prime no. upto n

static void allprime(int n){
  
    
    for(int num=2;num<=n;num++){
        boolean prime = isprime(num);
        if(prime == true){
           System.out.println(num);
        }
    }
}













     static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your digit: ");
        int num = sc.nextInt();

        // printdigits(num);
        // count(num);
        // sumdigit(num);
        // reverse(num);
        // ispalindrome(num);
        // System.out.print("Prime no: " + isprime(num));
        //getgcd(18,12);
        // getlcm(18,12);
        //    fact(num);
        //   System.out.print("Armstrong no.: " + isarmstrong(num));
        //    System.out.print("Perfect no.: " + isPerfect(num));
          allprime(num);
        









     }  
}