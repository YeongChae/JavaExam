import java.util.ArrayList;

/**
 * Created by 김영채 on 2016-01-25.
 */
public class ArrayListExam {
    public static void main(String[] args) {
        Picture pic1 = new Picture("degas1.jpg");
        Picture pic2 = new Picture("gaugin1.jpg");
        Picture pic3 = new Picture("monet1.jpg");
        Picture pic4 = new Picture("monet2.jpg");
        Picture pic5 = new Picture("renoir1.jpg");

        // pic1.getMaxX() : 오른쪽 끝 x 좌표
        // pic1.getWidth() : 가로 길이
        // pic1.translate(x,y) : x,y 만큼 그림 이동
        // pic1.draw()  : 그림을 출력

        // ArrayList<Picture> 생성하고 add하고
        ArrayList<Picture> list = new ArrayList<>();

        list.add(pic1);
        list.add(pic2);
        list.add(pic3);
        list.add(pic4);
        list.add(pic5);

        // for문으로 draw
        int width = 0;
        int widthSum = 0;
        int count = 0;

        // 첫 그림에서 30씩 옮겨서 출력
        for (int i = 0; i < list.size(); i++) {
            Picture pic = list.get(i);
            pic.translate(width, 0);              // 최초 0 , 0 에서 그림이 그려지고,
            width += pic.getWidth() + 30;         // +=로 width 에 30을 계속 더하면 for문 반복하면서 그곳에서 시작.
            pic.draw();
            widthSum += pic.getWidth();
        }
        System.out.println(widthSum);           //가로 길이의 총합

        // for 앞에 알트 + 엔터 누르고 향상된 for문으로 자동변환가능 내용은 위와 같음
        for (Picture pic : list) {
            pic.draw();
        }


        // 세로사진만 출력
        ArrayList<Picture> matches = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Picture pic = list.get(i);
            if (pic.getWidth() < pic.getHeight()) {
                matches.add(pic);
                count++;                          // if문에 들어왔을때만 카운팅.
                pic.translate(width, 0);              // 최초 0 , 0 에서 그림이 그려지고,
                width += pic.getWidth() + 30;         // +=로 width 에 30을 계속 더하면 for문 반복하면서 그곳에서 시작.
                pic.draw();
                break;                           //세로 사진의 첫번째 사진 출력  (for문을 break로 1회만 draw 하고 종료)

            }
        }
        System.out.println(count);
        //세로 사진만 찾아서 matches(ArrayList)에 저장
        //        int sum = 0;
//        ArrayList<Picture> matches = new ArrayList<>();
//        for (int i = 0 ; i < list.size(); i ++){
//            Picture pic = list.get(i);
//            if (pic.getWidth() < pic.getHeight()){
//                matches.add(pic);
//            }
//        }
//        System.out.println(matches.size());

    }
}
