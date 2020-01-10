package com.github.barteksc.pdfviewer.listener;

/**
 *
 */
public interface OnZoomChangeListener {

	/**
	 * Call whenever the zoom of the pdf changes
	 * @param zoom current zoom value
	 */
	void onZoomChanged(float zoom);
}
