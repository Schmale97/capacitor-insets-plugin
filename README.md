
# capacitor-insets-plugin
Plugin that sends the device insets, at the moment works only on android, and send only top, its for a emergency.
Fell free to open a pull request

## Installation:
```sh
npm install --save capacitor-insets-plugin
npx cap sync
```

# Android:
```java
// Add this line
import com.lighteam.plugin.capacitorinsetsplugin.InsetsPlugin;

public class MainActivity extends BridgeActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    this.init(savedInstanceState, new ArrayList<Class<? extends Plugin>>() {{
      // and this line
      add(InsetsPlugin.class);
    }});
  }
}
```


## Usage:
```typescript
const { StatusBar, InsetsPlugin } = Plugins;

StatusBar.setOverlaysWebView({ overlay: true });
StatusBar.setStyle({ style: StatusBarStyle.Dark });

InsetsPlugin.top()
    .then((resp: { value: number }) => {
        document.documentElement.style.setProperty('--top-inset', `${resp.value}px`);
    });
```

