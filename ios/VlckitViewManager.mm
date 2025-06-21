#import <React/RCTViewManager.h>
#import <React/RCTUIManager.h>
#import "RCTBridge.h"

@interface VlckitViewManager : RCTViewManager
@end

@implementation VlckitViewManager

RCT_EXPORT_MODULE(VlckitView)

- (UIView *)view
{
  return [[UIView alloc] init];
}

RCT_EXPORT_VIEW_PROPERTY(color, NSString)

@end
