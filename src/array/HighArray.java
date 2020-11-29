
package array;


 class HighArray {
    private long[]arr;
    private int n;
    public HighArray(int max){
    arr=new long[max];
    n=0;}
    public boolean find(long key){
    int i;
    for(i=0;i<n;i++)
        if(arr[i]==key)
            break;
    if(i==n)
        return false;
    else
        return true;
        }
    public void insert(long value){
    arr[n]=value;
    n++;}
    public boolean delet(long value){
    int i;
    for(i=0;i<n;i++)
        if(arr[i]==value)
            break;
    if(i==n)
        return false;
    else
    {
    int j;
    for(j=i;j<n;j++){
        arr[j]=arr[j+1];
        
    }
    n--;
    return true;}
    }
    public void display(){
    for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    System.out.println("");}
    
    
}
