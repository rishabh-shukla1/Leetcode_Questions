class Solution {
    public long dividePlayers(int[] skill) {


        Arrays.sort(skill);

        long a=0;

        long sum=skill[0]+skill[skill.length-1];

        for(int i=0;i<skill.length/2;i++)

        {
            if(skill[i]+skill[skill.length-1-i] !=sum )
            return -1;

            a=a+skill[i]*skill[skill.length-1-i];
            
        }

        return a;

        
    }
}