package $package

import android.app.Activity
import andorid.os.Bundle

class MainActivity extends Activity with TypedActivity {
  override def onCreate(bundle: Bundle) {
    super.onCreate(bundle)
    setContentView(R.layout.activity_main)

    findView(TR.textView).setText("weclome bestng!")
  }
}