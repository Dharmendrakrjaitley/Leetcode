public class Codec {

    public HashMap<String,String> hm=new HashMap<String,String>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        
        //System.out.println(ch);
        StringBuilder str=new StringBuilder();
        for(int i=1;i<Math.random()*15;i++)
        {
            int temp=(int)Math.round(Math.random()*128);
            char ch=(char)temp;
            str.append(Character.toString(ch));
        }
        String shortUrl=str.toString();
        hm.put(shortUrl,longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        
           String longUrl= hm.get(shortUrl);
        
        return longUrl;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));