class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ch=s.toCharArray();
        int front=0;
        int rear=s.length()-1;
        while(front < rear)
        {
            if(!Character.isLetter(ch[front]))
            {
                front++;
                continue;
            }
             if(!Character.isLetter(ch[rear]))
            {
                rear--;
                continue;
            }
            char temp=ch[front];
            ch[front]=ch[rear];
            ch[rear]=temp;
            front++;
            rear--;
        }
        return new String(ch);
        
    }
}