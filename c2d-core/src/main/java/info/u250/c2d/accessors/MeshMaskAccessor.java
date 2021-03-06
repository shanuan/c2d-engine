package info.u250.c2d.accessors;

import aurelienribon.tweenengine.TweenAccessor;
import info.u250.c2d.graphic.FadeMask;

/**
 * The mask accessor aim to make change of the mask transparency .
 *
 * @author xjjdog
 */
public class MeshMaskAccessor implements TweenAccessor<FadeMask> {

    public final static int Transparency = 1;

    @Override
    public int getValues(FadeMask target, int tweenType, float[] returnValues) {
        switch (tweenType) {
            case Transparency:
                returnValues[0] = target.getTransparency();
                return 1;
            default:
                return -1;
        }
    }

    @Override
    public void setValues(FadeMask target, int tweenType, float[] newValues) {
        switch (tweenType) {
            case Transparency:
                target.setTransparency(newValues[0]);
            default:
                break;
        }
    }

}
