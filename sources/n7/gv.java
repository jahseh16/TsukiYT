package n7;

import gn.zn;
import ic.c5;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class gv extends fb<Float> {
    public gv(List<gn.y<Float>> list) {
        super(list);
    }

    @Override // n7.y
    /* JADX INFO: renamed from: mt, reason: merged with bridge method [inline-methods] */
    public Float c5(gn.y<Float> yVar, float f3) {
        return Float.valueOf(p(yVar, f3));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public float p(gn.y<Float> yVar, float f3) {
        Float f4;
        if (yVar.n3 == null || yVar.zn == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        zn<A> znVar = this.f6935v;
        return (znVar == 0 || (f4 = (Float) znVar.n3(yVar.fb, yVar.s.floatValue(), (Float) yVar.n3, (Float) yVar.zn, f3, v(), a())) == null) ? c5.c5(yVar.fb(), yVar.gv(), f3) : f4.floatValue();
    }

    public float w() {
        return p(n3(), gv());
    }
}
