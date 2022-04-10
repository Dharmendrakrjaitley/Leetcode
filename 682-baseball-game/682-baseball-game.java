class Solution {
    public int calPoints(String[] ops) {
        
        int[] record=new int[ops.length];
        int j=-1;
        for(int i=0;i<ops.length;i++)
        {
            if(ops[i].equals("C") || ops[i].equals("D") || ops[i].equals("+"))
            {
                if(ops[i].equals("C"))
                {
                    record[j]=0;
                    j--;
                }
                else if(ops[i].equals("D"))
                {
                    int temp=record[j];
                    record[++j]=temp*2;
                }
                else
                {
                    int a=record[j];
                    int b=record[j-1];
                    record[++j]=a+b;
                }
            }
            else
            {
                int x=Integer.parseInt(ops[i]);
                record[++j]=x;
            }
                
        }
        
        int sum=0;
        for(int i=0;i<record.length;i++)
        {
            sum+=record[i];
        }
        return sum;
    }
}