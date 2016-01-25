import java.util.ArrayList;

/**
 * Created by 김영채 on 2016-01-25.
 */
public class ArrayListExam {
    public static void main(String[] args) {
        Picture pic1 = new Picture("degas1.jpg");
        Picture pic2 = new Picture("gaugin1.jpg");
        Picture pic3 = new Picture("i11428746022.gif");
        Picture pic4 = new Picture("monet1.jpg");
        Picture pic5 = new Picture("monet2.jpg");

        // ArrayList<Picture> 생성하고 add하고
        ArrayList<Picture> list = new ArrayList<>();
        list.add(pic1);
        list.add(pic2);
        list.add(pic3);
        list.add(pic4);
        list.add(pic5);
        // for문으로 draw

//        for (int i = 0; i < list.size(); i++) {
//            Picture pic = list.get(i);
//            pic.draw();
//        }
        // for 앞에 알트 + 엔터 누르고 향상된 for문으로 자동변환가능
//        for (Picture pic : list) {
//            pic.draw();
//        }

        // pic1.getMaxX() : 오른쪽 끝 x 좌표
        // pic1.getWidth() : 가로 길이
        // pic1.translate(x,y) : x,y 만큼 그림 이동
        // pic1.draw()  : 그림을 출력
        System.out.println(pic1.getMaxX());
        pic1.translate(100, 0);
        pic1.draw();
    }
}
