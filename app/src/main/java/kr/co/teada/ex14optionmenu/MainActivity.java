package kr.co.teada.ex14optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final int MENU_AA=1; //상수를 만들때는 public static 까지 쓰는게 좋아
    final int MENU_BB=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //onCreate() 메소드가 실행된 후
    //자동으로 OptionMenu를 만드는 작업을 하는
    //콜백메소드(내가 부르지 않았는데 운영체제(os)가 부르는 메소드)가 하나 호출됨


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

//        //여기서 메뉴의 아이템 추가작업 작성
//        menu.add(0, MENU_AA, 0, "aa");
//        menu.add(0, MENU_BB,0,"bb");
//
//        //만약 아이콘을 넣고 싶다면..
//        //위에서 add()를 통해 자동 생성된 MenuItem 객체를 따로 얻어와야 함
//        MenuItem item = menu.getItem(0);
//        item.setIcon(R.drawable.ic_launcher_foreground);

        //이런식으로 자바언어에서 MenuItem을 만들어 추가하는 방식은
        //코드가 지저분해

        //그래서 메뉴 아이템들을 xml 언어를 이용해 설계!

        //res 폴더 안에 menu 폴더 안에 있는 actionbar.xml 문서를
        //자바에서의 객체로 생성(부풀리다: inflate) 시켜주는 능력을
        // //가진 객체를 운영체제 대리인(Context)얻어와야 함
        MenuInflater inflater=this.getMenuInflater();
        inflater.inflate(R.menu.actionbar, menu);


        return super.onCreateOptionsMenu(menu);
    }

    //OptionMenu의 메뉴항목(MenuItem)을 선택했을 때
    //자동으로 실행되는 콜백메소드가 이미 액티비티에 존재함


    //토스트 띄워주기
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //선택된 메뉴 항목(MenuItem)에 따라 동작 수행
        int id=item.getItemId();
        switch(id){
            case R.id.menu_search:
                Toast.makeText(this,"search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_add:
                Toast.makeText(this,"add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_help:
                Toast.makeText(this,"help",Toast.LENGTH_SHORT).show();
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}
