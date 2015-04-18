package fi.ptm.popupmenuexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.Toast;

/**
 *
 * @author PTM
 */

public class MainActivity extends Activity implements OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPopUp(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.popup_menu, popup.getMenu());
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_copy:
                Toast.makeText(getApplicationContext(), "copy", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_paste:
                Toast.makeText(getApplicationContext(), "paste", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_delete:
                Toast.makeText(getApplicationContext(), "delete", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}
