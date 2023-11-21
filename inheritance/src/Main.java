import copywriting.*;

public class Main {
    public static void main(String[] args) {
        Tiktok tiktok = new Tiktok("How to gitgud in dark souls", "Solaire", "#darksouls, #gitgut, #eznub", "How to get good in a dark souls game", "lorempixel.com/640/480/");
        System.out.println(tiktok.getTitle());
        System.out.println(tiktok.getAuthor());
        System.out.println(tiktok.getContent());
        System.out.println(tiktok.getVideoUrl());

        Linkedin linkedin = new Linkedin("How to ace your Frontend Interview!", "Endra Lazuardi", "Step by step on how to ace your interview", "lorem.com");
        System.out.println(linkedin.getTitle());
        System.out.println(linkedin.getAuthor());
        System.out.println(linkedin.getContent());
        System.out.println(linkedin.getLinkUrl());

        Instagram instagram = new Instagram("Oprec Mobile Innovations", "MobileInnovation Lab", "Open Recruitment", "image.com");
        System.out.println(instagram.getTitle());
        System.out.println(instagram.getAuthor());
        System.out.println(instagram.getContent());
        System.out.println(instagram.getImageUrl());

    }
}
