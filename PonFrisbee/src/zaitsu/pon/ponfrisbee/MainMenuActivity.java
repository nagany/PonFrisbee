package zaitsu.pon.ponfrisbee;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainMenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);

        Button btnRank = (Button)findViewById(R.id.btnRank);
        //ƒ‰ƒ“ƒLƒ“ƒO‰æ–Ê‚É‘JˆÚ
        btnRank.setOnClickListener(new OnClickListener() {
        	@Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClassName("zaitsu.pon.ponfrisbee", "zaitsu.pon.ponfrisbee.RankingActivity");
                startActivity(intent);
            }
        });
        
        Button btnGame = (Button)findViewById(R.id.btnGame);
        //ƒQ[ƒ€‰æ–Ê‚É‘JˆÚ
        btnGame.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClassName("zaitsu.pon.ponfrisbee", "zaitsu.pon.ponfrisbee.GameActivity");
				startActivity(intent);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}

}
