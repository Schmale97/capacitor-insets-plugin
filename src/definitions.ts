declare module '@capacitor/core' {
  interface PluginRegistry {
    InsetsPlugin: InsetsPluginPlugin;
  }
}

export interface InsetsPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  top(): Promise<{value: number}>;
}
