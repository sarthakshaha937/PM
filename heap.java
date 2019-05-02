package heap;

import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class heap extends JFrame {
    static int []a=new int [50];
    static int n;
    static int [][]t = { {950  ,750 , 1150 , 650 , 850 , 1050 , 1250 , 600 , 700 , 800 , 900 , 1000 , 1100 , 1200 , 1300 ,
                          575 , 625 , 675 , 725 , 775 , 825 , 875 , 925 , 975 , 1025 , 1075 , 1125 , 1175 , 1225 , 1275 , 1325} ,
                          {100 , 200 , 200 , 300 ,300 , 300 , 300 , 400 ,400 , 400 , 400 , 400 , 400 , 400 , 400 , 500 ,500 ,
                           500 , 500 ,500 , 500 ,500 ,500 ,500 ,500 ,500 ,500 ,500 ,500 ,500 ,500}};
    public static void accept()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
    }
    @Override
    public void paint(Graphics g)
    {
         Font f = new Font("TimesRoman" , Font.BOLD , 40);
            g.setFont(f);

        g.setColor(Color.BLACK);
        heap.bresnanC(700, 800, 20, g);
        g.drawString(" = nodes are selected to compare", 750, 810);
        g.setColor(Color.BLUE);
        heap.bresnanC(700, 850, 20, g);
        g.drawString(" = nodes are selected to swap ", 750, 860);
         int i,x=100,y=700;
        String b1="BUILDING THE MAX HEAP",b2,n1,n2;
        
        //Font f = new Font("TimesRoman" , Font.BOLD , 40);
            g.setFont(f);
            g.drawString(b1,100 , 100);
            try 
        {
            TimeUnit.SECONDS.sleep(1);
            
        } catch (InterruptedException ex) 
        {
            Logger.getLogger(heap.class.getName()).log(Level.SEVERE, null, ex);   
        }
            
            heap.array(g);
            heap.draw(g);
            g.setColor(Color.BLACK);
            b2="HEAP SORT COMPLETED";
            g.drawString(b2,100 , 100);
        
    }
    
    public static void draw(Graphics g)
    {
        java.lang.String[]e;
        e = new String[n];
        int i , j , r , x , y;
        Font f = new Font("TimesRoman" , Font.BOLD , 20);
            g.setFont(f);
            for(i = 0 ; i < n ; i++)
            {   
                            try {
                                TimeUnit.MILLISECONDS.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(heap.class.getName()).log(Level.SEVERE, null, ex);
                                                                }
            g.setColor(Color.red);
                r = 20;
            for(y = -r ; y < r ; y++)
            {
            for(x = -r ; x < r ; x++)
            {
                if(x*x+y*y <= r*r)
                {
                  g.fillOval(t[0][i]+x, t[1][i]+y, 5, 5);
                }
            }
            }
            
            
                if(2*i+1 < n)
                {   
                    heap.dda(t[0][i], t[1][i], t[0][2*i+1], t[1][2*i+1], g);
                }
              
                               try {
                                TimeUnit.MILLISECONDS.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(heap.class.getName()).log(Level.SEVERE, null, ex);
                                                              }
                
            
         
            
                    if(2*i+2 < n)
                        heap.dda(t[0][i], t[1][i], t[0][2*i+2], t[1][2*i+2], g);
                g.setColor(Color.BLACK);
                e[i] = String.valueOf(a[i]);
                g.drawString(e[i] , t[0][i]-7, t[1][i]+7);
                e[i] = String.valueOf(i);
                g.drawString(e[i] , t[0][i]-5, t[1][i]+45);
                g.setColor(Color.red);
                
            }
        
        i = ((n-2)/2);
        for(;i>=0;i--)
        {
                  try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(heap.class.getName()).log(Level.SEVERE, null, ex);
            }
                  
        g.setFont(f);
        g.drawString("Heapifying to build Max Haap", 700, 700);
        heap.heapify(a, n ,i , g);
        
        try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(heap.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        g.drawString("MAX HEAP BUILD SUCCESSFULLY", 100, 100);
        g.clearRect(650, 650,500 , 100);
         try {
                TimeUnit.MILLISECONDS.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(heap.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        int w,s;
        String a1 , a2;
        g.drawString("Applying the Heap Sort", 700, 700);
        for (i=n-1,s=n-1; i>0; i--,s--) 
            { 
           g.setColor(Color.BLUE);
           heap.bresnanC(t[0][i], t[1][i], 20, g);
           heap.bresnanC(t[0][s], t[1][s], 20, g);
          a1 = String.valueOf(a[0]);
        a2 = String.valueOf(a[i]);
         g.clearRect(50, 50, 750, 100);
         g.setFont(f);
        g.drawString("Swapping the first and the last i.e " + a1 +" & "+a2, 100, 100);
        try {
                TimeUnit.MILLISECONDS.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(heap.class.getName()).log(Level.SEVERE, null, ex);
            }
           heap.swap(0, s, a, g);
           g.clearRect(50, 50, 750, 100);
           
        //heap.swap(1, s, a, g);
        try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(heap.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        w = a[0];
        a[0] = a[i];
        a[i] = w;
        g.drawString("Now ReHeapifying the Tree with one less node i.e ignoring last node i.e" +a[i], 100, 100);
        
        try {
                TimeUnit.MILLISECONDS.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(heap.class.getName()).log(Level.SEVERE, null, ex);
            }
        g.clearRect(50, 50, 750, 100);
        heap.heapify(a, s, 0, g);
        g.clearRect(100,650 , n*50+50, 150);
        heap.array(g);
            }
        g.clearRect(650, 650, 500, 100);
        g.setColor(Color.BLACK);
        g.drawString("**the tree is in Min Heapify position**", 700, 700);
} 
    
    
    
    
    
    public static void heapify(int arr[], int n, int i,Graphics a) 
   { 
       a.clearRect(100, 650, 50*n+20, 150);
        heap.array(a);
    int largest = i; 
    int l = 2*i + 1; 
    int r = 2*i + 2; 
    int temp;
   a.setColor(Color.black);
    if(l<n)
    {
       heap.rect(100+50*largest, 700, 50, 50, a);
       heap.rect(100+50*l, 700, 50, 50, a);
       a.setColor(Color.black);
         heap.bresnanC(t[0][largest], t[1][largest], 20, a);
         heap.bresnanC(t[0][l], t[1][l], 20, a);
    }
    if(r<n)
    {
        heap.rect(100+50*r, 700, 50, 50, a);
        a.setColor(Color.black);
        heap.bresnanC(t[0][r], t[1][r], 20, a);
    }
    try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(heap.class.getName()).log(Level.SEVERE, null, ex);
            }
    if (l < n && arr[l] > arr[largest]) 
    {
        largest = l;
    }
  
    if (r < n && arr[r] > arr[largest]) 
        largest = r; 
    
   
//  if(largest == l)
//  {
//      a.setColor(Color.red);
//      heap.bresnanC(t[0][r], t[1][r], 20, a);
//      a.setColor(Color.white);
//      heap.rect(100+50*r, 700, 50, 50, a);
//        //a.drawRoundRect(100+50*r, 700, 50, 50,10,10);
//  }
//  else if(largest == r)
//  {
//      a.setColor(Color.red);
//      heap.bresnanC(t[0][l], t[1][l], 20, a);
//      a.setColor(Color.white);
//      heap.rect(100+50*l, 700, 50, 50, a);
//      //a.drawRoundRect(100+50*l, 700, 50, 50,10,10);
//  }
    
   
    if (largest != i) 
    { 
       a.setColor(Color.BLUE);
       heap.rect(100+50*largest, 700, 50, 50, a);
       heap.rect(100+50*i, 700, 50, 50, a);
       a.setColor(Color.BLUE);
       heap.bresnanC(t[0][i], t[1][i], 20, a);
       heap.bresnanC(t[0][largest], t[1][largest], 20, a);
       try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(heap.class.getName()).log(Level.SEVERE, null, ex);
            }
       heap.swap(i,largest,arr,a);
        temp = arr[i];
        arr[i] = arr[largest];
        arr[largest] = temp;
//        a.clearRect(100, 650, 50*n+20, 150);
//        heap.array(a);
        heap.heapify(arr, n, largest,a);
       
    }
   
} 
    
    public static void array(Graphics g)
    {
        int x = 100,y=700,i;
        String n1,n2;
        Font f2,f3=new Font("TimesRoman" , Font.BOLD , 20);
        f2 = new Font("TimesRoman" , Font.BOLD , 30);
            
            for(i=0;i<n;i++)
            {   g.setFont(f2);
                g.setColor(Color.YELLOW);
                g.fillRoundRect(x, y,50 , 50,20,20);
                g.setColor(Color.GREEN);
                g.drawRoundRect(x, y, 50, 50,20,20);
                n1 = String.valueOf(a[i]);
                g.drawString(n1, x+20, y+30);
                n2 = String.valueOf(i);
                g.setFont(f3);
                g.drawString(n2, x+25, y+70);
                x = x+50;
            }
    }
    
    public static void swap(int i , int largest,int arr[] , Graphics a)
    {
        
        Font f = new Font("TimesRoman" , Font.BOLD , 20);
            a.setFont(f);
            a.setColor(Color.BLACK);
        String s1,s2;
        s1 = String.valueOf(arr[i]);
        s2 = String.valueOf(arr[largest]);
        int dx , dy;
        dx = t[0][i]-t[0][largest];
        dy=t[1][i] - t[1][largest];
        if(dx>25 || dx<-25)
        {
            a.clearRect(0, 0, 1900, 600);
        heap.draw1(largest, i, a);
        a.setColor(Color.BLACK);
        a.drawString(s1, t[0][i]-(dx/2), t[1][i]);
        a.drawString(s2, t[0][largest]+(dx/2), t[1][largest]);
          try {
              TimeUnit.MILLISECONDS.sleep(500);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(heap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        a.clearRect(0, 0, 1900, 600);
        heap.draw1(largest, i, a);
        a.setColor(Color.BLACK);
        a.drawString(s1, t[0][i]-dx, t[1][i]);
        a.drawString(s2, t[0][largest]+dx, t[1][largest]);
                try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(heap.class.getName()).log(Level.SEVERE, null, ex);
            }
                
         if(dx>25 || dx<-25)
         {
        a.clearRect(0, 0, 1900, 600);
        heap.draw1(largest, i, a);
        a.setColor(Color.BLACK);
        a.drawString(s1, t[0][i]-dx, t[1][i]-(dy/2));
        a.drawString(s2, t[0][largest]+dx, t[1][largest]+(dy/2));
        try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(heap.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         }
        a.clearRect(0, 0, 1900, 600);
        heap.draw1(largest, i, a);
        a.setColor(Color.BLACK);
        a.drawString(s1, t[0][largest]-7, t[1][largest]+7);
        a.drawString(s2, t[0][i]-7, t[1][i]+7);
        try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(heap.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
    }
    
    public static void rect(int x,int y , int w , int h , Graphics b)
    {
       heap.dda(x, y, x+50, y, b);
       heap.dda(x, y, x, y+50, b);
       heap.dda(x+50, y, x+50, y+50, b);
       heap.dda(x, y+50, x+50, y+50, b);
       
    }
    
    public static void draw1(int largest , int parent ,Graphics g)
    {
        java.lang.String[]e;
        e = new String[n];
        int i , j , r , x , y;
        Font f = new Font("TimesRoman" , Font.BOLD , 20);
            g.setFont(f);
            for(i = 0 ; i < n ; i++)
            {   
                           
            g.setColor(Color.red);
                r = 20;
            for(y = -r ; y < r ; y++)
            {
            for(x = -r ; x < r ; x++)
            {
                if(x*x+y*y <= r*r)
                {
                  g.fillOval(t[0][i]+x, t[1][i]+y, 5, 5);
                }
            }
            }
            
            
                if(2*i+1 < n)
                {   
                    heap.dda(t[0][i], t[1][i], t[0][2*i+1], t[1][2*i+1], g);
                }
              
                               
                    if(2*i+2 < n)
                        heap.dda(t[0][i], t[1][i], t[0][2*i+2], t[1][2*i+2], g);
                if(i != largest && i!= parent)
                {
                g.setColor(Color.BLACK);
                e[i] = String.valueOf(a[i]);
                g.drawString(e[i] , t[0][i]-7, t[1][i]+7);
                e[i] = String.valueOf(i);
                g.drawString(e[i] , t[0][i]-5, t[1][i]+45);
                g.setColor(Color.red);
                }
                e[i] = String.valueOf(i);
                g.drawString(e[i] , t[0][i]-5, t[1][i]+45);
            }
        
        
    }
    
    
    public static void fill(int i, Graphics a,int arr[])
    {
        int rad = 20,x,y;
        java.lang.String[]e;
        e = new String[n]; 
            for(y = -rad ; y < rad ; y++)
            {
            for(x = -rad ; x < rad ; x++)
            {
                if(x*x+y*y <= rad*rad)
                {
                  a.fillOval(t[0][i]+x, t[1][i]+y, 5, 5);
                }
            }
            }
            e[i] = String.valueOf(arr[i]);
            a.drawString(e[i] , t[0][i]-7, t[1][i]+7);
    }
    
    public static void bresnanC(int x1, int y1 , int r , Graphics g)
    {
        float d = 3-2*r;
        int x=0,y=r;
        do
        {
       
            g.fillOval(x1+x, y1+y, 5 , 5);
            
            g.fillOval(x1+x , y1-y ,5 , 5);
           
            g.fillOval(x1-x , y1+y ,5 , 5);
            
            g.fillOval(x1-x , y1-y ,5 , 5);
            
            g.fillOval(x1+y, y1+x,5 , 5);
  
            g.fillOval(x1+y , y1-x ,5 , 5);
            
            g.fillOval(x1-y , y1+x ,5 , 5);
            
            g.fillOval(x1-y , y1-x ,5 , 5);
           
            if(d < 0)
            {
                d = d + 4*x+6;
            }
            else
            {
                d = d+4*(x-y)+1;
                y = y - 1;
            }
            x = x+1;
        }while(x <= y);
    }
    
    public static void bresnan(int x0 , int y0 , int x1 , int y1 , Graphics g)
    {
        g.setColor(Color.black);
        int dx , dy , p , x , y;
        dx = x1 - x0;
        dy = y1 - y0;
        
        x = x0;
        y = y0;
        
        p = 2*dy-dx;
        
        while(x < x1)
        {
           if(p >= 0)
           {
               
               g.fillOval(x, y, 5, 5);
               y = y+1;
               p=p+2*dy-2*dx;
           }
           else
           {
               g.fillOval(x, y, 5, 5);
               p = p+2*dy;
           }
           x = x+1;
        }
    }
    
    public static void dda(int x0 , int y0 , int x1 , int y1 , Graphics g)
    {
            double dx , dy  , span , i;
            double x , y,xd,yd;
            xd = x1-x0;
            yd = y1-y0;
            
            if(Math.abs(xd) >= Math.abs(yd))
            {
                span = Math.abs(xd);
            }
            else
                span = Math.abs(y1-y0);
            dx = (x1 - x0) / span;
            dy = (y1 - y0) / span;
            x = x0;
            y = y0;
             g.setColor(Color.red);
            g.fillOval((int)x,(int) y, 5, 5);
            for(i = 1 ; i <= span ; i++)                
            {
                
                x = x + dx;
                y = y + dy;
                g.fillOval((int)x, (int)y, 5, 5);
            }
    }
 
  public static void main(String[] args) {
        heap d = new heap();
        heap.accept();
        d.setTitle("Heap Sort");
        d.setSize(1900, 1050);
        d.setVisible(true);
  }
}
