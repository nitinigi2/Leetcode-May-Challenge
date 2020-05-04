// Question link: https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3319/

public int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        
        while(num > 0)
        {
            sb.append(num%2);
            num /= 2;
        }
        
        String binaryString = sb.reverse().toString();
        String comp = "";
        for(char c: binaryString.toCharArray())
        {
            if(c == '1')
                comp += '0';
            
            else
                comp += '1';
        }
        
        int result = 0;
        for(int i=comp.length()-1,j=0;i>=0;i--,j++)
        {
            int x = (int)Math.pow(2,j);
            result += Character.getNumericValue(comp.charAt(i)) * x;
            
        }
        
        return result;
    }
