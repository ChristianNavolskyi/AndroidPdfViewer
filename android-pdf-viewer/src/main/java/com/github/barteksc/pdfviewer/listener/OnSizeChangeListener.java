package com.github.barteksc.pdfviewer.listener;

public interface OnSizeChangeListener {

    /**
     * Called when the displayed size of the pdf changes.
     * @param width of the pdf page
     * @param height of the pdf page
     */
    void onSizeChanged(float width, float height);
}
