class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int a[]=new int[nums.length-k+1];

        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty() && nums[dq.getLast()]<nums[i])
            {
                dq.removeLast();

            }
            dq.add(i);
        }
            int j=0;
            a[j++]=nums[dq.getFirst()];

            for(int i=k;i<nums.length;i++)
            {
                //grow

                 while(!dq.isEmpty() && nums[dq.getLast()]<nums[i])
            {
                dq.removeLast();

            }

            dq.add(i);

                //shrink
                if(i-k==dq.getFirst())
                {
                    dq.remove();
                }
                //ans

                a[j++]=nums[dq.getFirst()];

            }


              return a;
        }



      


       

        
        
    }
