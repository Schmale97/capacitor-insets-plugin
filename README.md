
# capacitor-insets-plugin
Plugin that sends the device insets, at the moment works only on android, and send only top, its for a emergency.
Fell free to open a pull request

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

