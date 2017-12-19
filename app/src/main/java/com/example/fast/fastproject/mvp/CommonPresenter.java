package com.example.fast.fastproject.mvp;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * 全局统一的Presenter
 * Created by Administrator on 2017/12/18.
 */
public class CommonPresenter implements
        BasePresenter, ApiContract.Presenter {

    //***************************************** builder ******************************************
    private BaseView mBaseView;
    private ApiContract.View1 View1;
    private ApiContract.View2 View2;
    private ApiContract.View3 View3;
    private ApiContract.View4 View4;
    private ApiContract.View5 View5;
    private ApiContract.View6 View6;
    private ApiContract.View7 View7;
    private ApiContract.View8 View8;
    private ApiContract.View9 View9;
    private ApiContract.View10 View10;
    private ApiContract.View11 View11;
    private ApiContract.View12 View12;
    private ApiContract.View13 View13;
    private ApiContract.View14 View14;
    private ApiContract.View15 View15;
    private ApiContract.View16 View16;
    private ApiContract.View17 View17;
    private ApiContract.View18 View18;
    private ApiContract.View19 View19;
    private ApiContract.View20 View20;
    private ApiContract.View21 View21;
    private ApiContract.View22 View22;
    private ApiContract.View23 View23;
    private ApiContract.View24 View24;
    private ApiContract.View25 View25;
    private ApiContract.View26 View26;
    private ApiContract.View27 View27;
    private ApiContract.View28 View28;
    private ApiContract.View29 View29;
    private ApiContract.View30 View30;
    private ApiContract.View31 View31;
    private ApiContract.View32 View32;
    private ApiContract.View33 View33;
    private ApiContract.View34 View34;
    private ApiContract.View35 View35;
    private ApiContract.View36 View36;
    private ApiContract.View37 View37;
    private ApiContract.View38 View38;
    private ApiContract.View39 View39;
    private ApiContract.View40 View40;
    private ApiContract.View41 View41;
    private ApiContract.View42 View42;
    private ApiContract.View43 View43;
    private ApiContract.View44 View44;
    private ApiContract.View45 View45;
    private ApiContract.View46 View46;
    private ApiContract.View47 View47;
    private ApiContract.View48 View48;
    private ApiContract.View49 View49;
    private ApiContract.View50 View50;
    private ApiContract.View51 View51;
    private ApiContract.View52 View52;
    private ApiContract.View53 View53;
    private ApiContract.View54 View54;
    private ApiContract.View55 View55;
    private ApiContract.View56 View56;
    private ApiContract.View57 View57;
    private ApiContract.View58 View58;
    private ApiContract.View59 View59;
    private ApiContract.View60 View60;
    private ApiContract.View61 View61;
    private ApiContract.View62 View62;
    private ApiContract.View63 View63;
    private ApiContract.View64 View64;
    private ApiContract.View65 View65;
    private ApiContract.View66 View66;
    private ApiContract.View67 View67;
    private ApiContract.View68 View68;
    private ApiContract.View69 View69;
    private ApiContract.View70 View70;
    private ApiContract.View71 View71;
    private ApiContract.View72 View72;
    private ApiContract.View73 View73;
    private ApiContract.View74 View74;
    private ApiContract.View75 View75;
    private ApiContract.View76 View76;
    private ApiContract.View77 View77;
    private ApiContract.View78 View78;
    private ApiContract.View79 View79;
    private ApiContract.View80 View80;
    private ApiContract.View81 View81;
    private ApiContract.View82 View82;
    private ApiContract.View83 View83;
    private ApiContract.View84 View84;
    private ApiContract.View85 View85;
    private ApiContract.View86 View86;
    private ApiContract.View87 View87;
    private ApiContract.View88 View88;
    private ApiContract.View89 View89;
    private ApiContract.View90 View90;
    private ApiContract.View91 View91;
    private ApiContract.View92 View92;
    private ApiContract.View93 View93;
    private ApiContract.View94 View94;
    private ApiContract.View95 View95;
    private ApiContract.View96 View96;
    private ApiContract.View97 View97;
    private ApiContract.View98 View98;
    private ApiContract.View99 View99;
    private ApiContract.View100 View100;

    public CommonPresenter(BaseView mBaseView, ApiContract.View1 view1, ApiContract.View2 view2, ApiContract.View3 view3, ApiContract.View4 view4, ApiContract.View5 view5, ApiContract.View6 view6, ApiContract.View7 view7, ApiContract.View8 view8, ApiContract.View9 view9, ApiContract.View10 view10, ApiContract.View11 view11, ApiContract.View12 view12, ApiContract.View13 view13, ApiContract.View14 view14, ApiContract.View15 view15, ApiContract.View16 view16, ApiContract.View17 view17, ApiContract.View18 view18, ApiContract.View19 view19, ApiContract.View20 view20, ApiContract.View21 view21, ApiContract.View22 view22, ApiContract.View23 view23, ApiContract.View24 view24, ApiContract.View25 view25, ApiContract.View26 view26, ApiContract.View27 view27, ApiContract.View28 view28, ApiContract.View29 view29, ApiContract.View30 view30, ApiContract.View31 view31, ApiContract.View32 view32, ApiContract.View33 view33, ApiContract.View34 view34, ApiContract.View35 view35, ApiContract.View36 view36, ApiContract.View37 view37, ApiContract.View38 view38, ApiContract.View39 view39, ApiContract.View40 view40, ApiContract.View41 view41, ApiContract.View42 view42, ApiContract.View43 view43, ApiContract.View44 view44, ApiContract.View45 view45, ApiContract.View46 view46, ApiContract.View47 view47, ApiContract.View48 view48, ApiContract.View49 view49, ApiContract.View50 view50, ApiContract.View51 view51, ApiContract.View52 view52, ApiContract.View53 view53, ApiContract.View54 view54, ApiContract.View55 view55, ApiContract.View56 view56, ApiContract.View57 view57, ApiContract.View58 view58, ApiContract.View59 view59, ApiContract.View60 view60, ApiContract.View61 view61, ApiContract.View62 view62, ApiContract.View63 view63, ApiContract.View64 view64, ApiContract.View65 view65, ApiContract.View66 view66, ApiContract.View67 view67, ApiContract.View68 view68, ApiContract.View69 view69, ApiContract.View70 view70, ApiContract.View71 view71, ApiContract.View72 view72, ApiContract.View73 view73, ApiContract.View74 view74, ApiContract.View75 view75, ApiContract.View76 view76, ApiContract.View77 view77, ApiContract.View78 view78, ApiContract.View79 view79, ApiContract.View80 view80, ApiContract.View81 view81, ApiContract.View82 view82, ApiContract.View83 view83, ApiContract.View84 view84, ApiContract.View85 view85, ApiContract.View86 view86, ApiContract.View87 view87, ApiContract.View88 view88, ApiContract.View89 view89, ApiContract.View90 view90, ApiContract.View91 view91, ApiContract.View92 view92, ApiContract.View93 view93, ApiContract.View94 view94, ApiContract.View95 view95, ApiContract.View96 view96, ApiContract.View97 view97, ApiContract.View98 view98, ApiContract.View99 view99, ApiContract.View100 view100) {
        this.mBaseView = mBaseView;
        View1 = view1;
        View2 = view2;
        View3 = view3;
        View4 = view4;
        View5 = view5;
        View6 = view6;
        View7 = view7;
        View8 = view8;
        View9 = view9;
        View10 = view10;
        View11 = view11;
        View12 = view12;
        View13 = view13;
        View14 = view14;
        View15 = view15;
        View16 = view16;
        View17 = view17;
        View18 = view18;
        View19 = view19;
        View20 = view20;
        View21 = view21;
        View22 = view22;
        View23 = view23;
        View24 = view24;
        View25 = view25;
        View26 = view26;
        View27 = view27;
        View28 = view28;
        View29 = view29;
        View30 = view30;
        View31 = view31;
        View32 = view32;
        View33 = view33;
        View34 = view34;
        View35 = view35;
        View36 = view36;
        View37 = view37;
        View38 = view38;
        View39 = view39;
        View40 = view40;
        View41 = view41;
        View42 = view42;
        View43 = view43;
        View44 = view44;
        View45 = view45;
        View46 = view46;
        View47 = view47;
        View48 = view48;
        View49 = view49;
        View50 = view50;
        View51 = view51;
        View52 = view52;
        View53 = view53;
        View54 = view54;
        View55 = view55;
        View56 = view56;
        View57 = view57;
        View58 = view58;
        View59 = view59;
        View60 = view60;
        View61 = view61;
        View62 = view62;
        View63 = view63;
        View64 = view64;
        View65 = view65;
        View66 = view66;
        View67 = view67;
        View68 = view68;
        View69 = view69;
        View70 = view70;
        View71 = view71;
        View72 = view72;
        View73 = view73;
        View74 = view74;
        View75 = view75;
        View76 = view76;
        View77 = view77;
        View78 = view78;
        View79 = view79;
        View80 = view80;
        View81 = view81;
        View82 = view82;
        View83 = view83;
        View84 = view84;
        View85 = view85;
        View86 = view86;
        View87 = view87;
        View88 = view88;
        View89 = view89;
        View90 = view90;
        View91 = view91;
        View92 = view92;
        View93 = view93;
        View94 = view94;
        View95 = view95;
        View96 = view96;
        View97 = view97;
        View98 = view98;
        View99 = view99;
        View100 = view100;
    }

    private CompositeDisposable mCompositeDisposable;

    private void addSubscription(Observable observable, Observer observer) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }

        mBaseView.toShowLoading();

        observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    @Override
    public void unSubscribe() {
        mCompositeDisposable.clear();
    }

    //************************************************* request **************************************
    @Override
    public void request1(Map<String, String> map) {
        addSubscription(NetWorkManager.getApi().get1(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View1.convert1(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }

    @Override
    public void request2(Map<String, String> map) {
        addSubscription(NetWorkManager.getApi().get2(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View2.convert2(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }

    @Override
    public void request3(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get3(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View3.convert3(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }

    @Override
    public void request4(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get4(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View4.convert4(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }

    @Override
    public void request5(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get5(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View5.convert5(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request6(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get6(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View6.convert6(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request7(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get7(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View7.convert7(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request8(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get8(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View8.convert8(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request9(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get9(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View9.convert9(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request10(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get10(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View10.convert10(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request11(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get11(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View11.convert11(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request12(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get12(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View12.convert12(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request13(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get13(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View13.convert13(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request14(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get14(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View14.convert14(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request15(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get15(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View15.convert15(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request16(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get16(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View16.convert16(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request17(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get17(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View17.convert17(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request18(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get18(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View18.convert18(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request19(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get19(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View19.convert19(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request20(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get20(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View20.convert20(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request21(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get21(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View21.convert21(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request22(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get22(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View22.convert22(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request23(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get23(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View23.convert23(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request24(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get24(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View24.convert24(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request25(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get25(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View25.convert25(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request26(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get26(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View26.convert26(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request27(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get27(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View27.convert27(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request28(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get28(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View28.convert28(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request29(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get29(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View29.convert29(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request30(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get30(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View30.convert30(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request31(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get31(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View31.convert31(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request32(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get32(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View32.convert32(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request33(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get33(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View33.convert33(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request34(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get34(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View34.convert34(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request35(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get35(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View35.convert35(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request36(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get36(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View36.convert36(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request37(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get37(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View37.convert37(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request38(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get38(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View38.convert38(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request39(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get39(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View39.convert39(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request40(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get40(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View40.convert40(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request41(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get41(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View41.convert41(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request42(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get42(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View42.convert42(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request43(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get43(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View43.convert43(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request44(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get44(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View44.convert44(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request45(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get45(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View45.convert45(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request46(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get46(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View46.convert46(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request47(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get47(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View47.convert47(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request48(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get48(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View48.convert48(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request49(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get49(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View49.convert49(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request50(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get50(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View50.convert50(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request51(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get51(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View51.convert51(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request52(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get52(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View52.convert52(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request53(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get53(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View53.convert53(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request54(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get54(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View54.convert54(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request55(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get55(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View55.convert55(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request56(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get56(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View56.convert56(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request57(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get57(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View57.convert57(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request58(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get58(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View58.convert58(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request59(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get59(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View59.convert59(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request60(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get60(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View60.convert60(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request61(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get61(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View61.convert61(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request62(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get62(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View62.convert62(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request63(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get63(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View63.convert63(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request64(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get64(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View64.convert64(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request65(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get65(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View65.convert65(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request66(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get66(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View66.convert66(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request67(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get67(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View67.convert67(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request68(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get68(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View68.convert68(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request69(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get69(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View69.convert69(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request70(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get70(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View70.convert70(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request71(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get71(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View71.convert71(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request72(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get72(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View72.convert72(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request73(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get73(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View73.convert73(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request74(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get74(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View74.convert74(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request75(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get75(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View75.convert75(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request76(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get76(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View76.convert76(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request77(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get77(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View77.convert77(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request78(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get78(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View78.convert78(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request79(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get79(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View79.convert79(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request80(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get80(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View80.convert80(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request81(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get81(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View81.convert81(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request82(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get82(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View82.convert82(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request83(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get83(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View83.convert83(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request84(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get84(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View84.convert84(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request85(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get85(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View85.convert85(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request86(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get86(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View86.convert86(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request87(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get87(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View87.convert87(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request88(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get88(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View88.convert88(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request89(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get89(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View89.convert89(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request90(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get90(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View90.convert90(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request91(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get91(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View91.convert91(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request92(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get92(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View92.convert92(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request93(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get93(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View93.convert93(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request94(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get94(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View94.convert94(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request95(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get95(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View95.convert95(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request96(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get96(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View96.convert96(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request97(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get97(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View97.convert97(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request98(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get98(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View98.convert98(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request99(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get99(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View99.convert99(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }


    @Override
    public void request100(HashMap<String, Object> map) {
        addSubscription(NetWorkManager.getApi().get100(map), new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(Object o) {
                View100.convert100(o.toString());
            }

            @Override
            public void onError(Throwable e) {
                mBaseView.requestFail(e);
                mBaseView.toHiddenLoading();
            }

            @Override
            public void onComplete() {
                mBaseView.toHiddenLoading();
            }
        });
    }

}
