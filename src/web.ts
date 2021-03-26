import { WebPlugin } from '@capacitor/core';
import { InsetsPluginPlugin } from './definitions';

export class InsetsPluginWeb extends WebPlugin implements InsetsPluginPlugin {
  constructor() {
    super({
      name: 'InsetsPlugin',
      platforms: ['web'],
    });
  }
    top(): Promise<{ value: number; }> {
        throw new Error('Method not implemented.');
    }

  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}

const InsetsPlugin = new InsetsPluginWeb();

export { InsetsPlugin };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(InsetsPlugin);
