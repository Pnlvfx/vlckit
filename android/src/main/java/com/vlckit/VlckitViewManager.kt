package com.vlckit

import android.graphics.Color
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.VlckitViewManagerInterface
import com.facebook.react.viewmanagers.VlckitViewManagerDelegate

@ReactModule(name = VlckitViewManager.NAME)
class VlckitViewManager : SimpleViewManager<VlckitView>(),
  VlckitViewManagerInterface<VlckitView> {
  private val mDelegate: ViewManagerDelegate<VlckitView>

  init {
    mDelegate = VlckitViewManagerDelegate(this)
  }

  override fun getDelegate(): ViewManagerDelegate<VlckitView>? {
    return mDelegate
  }

  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): VlckitView {
    return VlckitView(context)
  }

  @ReactProp(name = "color")
  override fun setColor(view: VlckitView?, color: String?) {
    view?.setBackgroundColor(Color.parseColor(color))
  }

  companion object {
    const val NAME = "VlckitView"
  }
}
