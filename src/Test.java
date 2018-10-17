    public class Test {
        public static void main (String[] args) {
            String srcImgPath = "F:\\picture_add_water\\example\\test.jpg";
            // 水印文字
            String logoText = "中华人民共和国";
            String targerTextPath2 = "F:\\picture_add_water\\example\\12345.jpg";
            System.out.println ("给图片添加水印文字开始...");
            // 给图片添加正水印文字
            ImageWatermarkUtil.ImageByText (logoText, srcImgPath, targerTextPath2, -40);
            // 给图片添加斜水印文字
            ImageWatermarkUtil.ImageByText (logoText, srcImgPath, targerTextPath2, 40);
            System.out.println ("给图片添加水印文字结束...");
        }
}
